package edu.mayo.cts2.framework.controller;


    /**
     * OSGi plugins to the CTS2 Development Framework exporting services with this interface
     * will be added to the set of REST Controllers.
     *
     * NOTE: Objects returned must be annotated with the
     * org.springframework.stereotype.Controller
     * annotation
     *
     * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
     */
    public interface ControllerProvider {

        /**
         * Gets the controller.
         *
         * @return the controller
         */
        public Object getController();
}
