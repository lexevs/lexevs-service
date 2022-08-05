package edu.mayo.cts2.framework.model.core;

import edu.mayo.cts2.framework.model.Cts2ModelObject;
import edu.mayo.cts2.framework.model.core.types.EntryState;

public interface IsChangeable extends Cts2ModelObject {

	ChangeableElementGroup getChangeableElementGroup();
	
	void setChangeableElementGroup(ChangeableElementGroup group);
	
	EntryState getEntryState();
	
	void setEntryState(EntryState entryState);
}
