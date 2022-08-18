package edu.mayo.cts2.framework.controller;

import edu.mayo.cts2.framework.model.core.ChangeDescription;
import edu.mayo.cts2.framework.model.core.ChangeableElementGroup;
import edu.mayo.cts2.framework.model.core.types.ChangeCommitted;
import edu.mayo.cts2.framework.model.core.types.ChangeType;
import java.util.Date;

public abstract class AbstractMainenanceHandler {

	protected ChangeableElementGroup createChangeableElementGroup(String changeSetUri, ChangeType changeType){
		ChangeableElementGroup group = new ChangeableElementGroup();
		group.setChangeDescription(this.createChangeDescription(changeSetUri, changeType));
		
		return group;
	}
	
	protected ChangeDescription createChangeDescription(String changeSetUri, ChangeType changeType){
		ChangeDescription changeDescription = new ChangeDescription();

		changeDescription.setChangeDate(new Date());
		changeDescription.setChangeType(changeType);
		changeDescription.setContainingChangeSet(changeSetUri);
		changeDescription.setCommitted(ChangeCommitted.PENDING);
		
		return changeDescription;
	}
	
}
