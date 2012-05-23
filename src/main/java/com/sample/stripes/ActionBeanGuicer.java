package com.sample.stripes;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.config.Configuration;
import net.sourceforge.stripes.controller.NameBasedActionResolver;

import com.google.inject.Injector;

/**
 * 
 * @author <a href="mailto:jayuelm@gmail.com">Jayuel Maamo</a>
 * 
 */
public class ActionBeanGuicer extends NameBasedActionResolver {
	Injector injector;

	@Override
	public void init(Configuration configuration) throws Exception {
		injector = (Injector) configuration.getServletContext().getAttribute(
				Injector.class.getName());
		super.init(configuration);
	}

	protected ActionBean makeNewActionBean(Class<? extends ActionBean> type,
			ActionBeanContext context) throws Exception {
		return injector.getInstance(type);
	}
}
