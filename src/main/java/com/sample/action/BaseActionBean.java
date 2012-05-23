package com.sample.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * 
 * @author <a href="mailto:jayuelm@gmail.com">Jayuel Maamo</a>
 * 
 */
public class BaseActionBean implements ActionBean {
	private ActionBeanContext context;

	public ActionBeanContext getContext() {
		return context;
	}

	public void setContext(ActionBeanContext context) {
		this.context = context;
	}
}
