package edu.mayo.cts2.framework.service.core.config;

import edu.mayo.cts2.framework.service.core.config.option.OptionHolder;
import edu.mayo.cts2.framework.service.core.config.option.StringOption;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.io.FileHandler;

public class ConfigUtils {

    protected static void addOrUpdateProperty(String propertyName, String propertyValue, File propsFile) {
        doModifyPropertiesFile(propertyName, propertyValue, propsFile, PropertiesModifyAction.ADD_OR_UPDATE);
    }

    protected static void addProperty(String propertyName, String propertyValue, File propsFile) {
        doModifyPropertiesFile(propertyName, propertyValue, propsFile, PropertiesModifyAction.FAIL_IF_FOUND);
    }

    private static void doModifyPropertiesFile(
            String propertyName,
            String propertyValue,
            File propsFile,
            PropertiesModifyAction action) {
        FileBasedConfiguration config = new PropertiesConfiguration();

        try {

            Parameters params = new Parameters();
            FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
                    new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
                            .configure(params.fileBased().setFile(propsFile));

            config = builder.getConfiguration();


            boolean exists = config.containsKey(propertyName);

            if (exists && action.equals(PropertiesModifyAction.FAIL_IF_FOUND)) {
                throw new RuntimeException("Property: " + propertyName + " already exists. It cannot be added.");
            }

            if (!exists && action.equals(PropertiesModifyAction.FAIL_IF_NOT_FOUND)) {
                throw new RuntimeException("Property: " + propertyName + " does not exists. It cannot be updated.");
            }

            //if its already there, don't overwrite it
            if (exists && action.equals(PropertiesModifyAction.ADD_IF_NOT_FOUND)) {
                return;
            }

        }
        catch (ConfigurationException e) {
            throw new IllegalStateException(e);
        }

        config.setProperty(propertyName, propertyValue);

        try {
            FileHandler handler = new FileHandler(config);
            handler.save();

        }
        catch (ConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    protected static void addPropertyIfNotFound(String propertyName, String propertyValue, File propsFile) {
        doModifyPropertiesFile(propertyName, propertyValue, propsFile, PropertiesModifyAction.ADD_IF_NOT_FOUND);
    }

    public static File createFile(String path) {
        File file = new File(path);
        createDirectory(file.getParent());

        try {
            file.createNewFile();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return file;
    }

    public static File createSubDirectory(File directory, String subDirectoryName) {
        if (!directory.exists()) {
            throw new IllegalStateException("Directory: " + directory.getPath() + " must exist before creating a " +
					"sub-directory.");
        }

        return createDirectory(directory.getPath() + File.separator + subDirectoryName);

    }

    public static File createDirectory(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        return file;
    }

    protected static Properties loadProperties(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        return loadProperties(file);
    }

    /**
     * Do load properties.
     *
     * @param file the file
     * @return the properties
     */
    public static Properties loadProperties(File file) {
        Properties props = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            props.load(fis);
        }
        catch (Exception e) {
            throw new IllegalStateException(e);
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }
            catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        return props;
    }

    public static OptionHolder propertiesToOptionHolder(Properties properties) {
        Set<StringOption> stringOptions = new HashSet<StringOption>();

        for (Entry<Object, Object> entry : properties.entrySet()) {

            String name = (String) entry.getKey();
            String value = (String) entry.getValue();

            stringOptions.add(new StringOption(name, value));
        }

        OptionHolder holder = new OptionHolder(stringOptions);

        return holder;
    }

    public static void updateProperty(String propertyName, String propertyValue, File propsFile) {
        doModifyPropertiesFile(propertyName, propertyValue, propsFile, PropertiesModifyAction.FAIL_IF_NOT_FOUND);
    }

    private enum PropertiesModifyAction {FAIL_IF_FOUND, FAIL_IF_NOT_FOUND, ADD_OR_UPDATE, ADD_IF_NOT_FOUND}
}
