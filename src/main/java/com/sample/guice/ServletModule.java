package com.sample.guice;

import java.util.HashMap;
import java.util.Map;

import net.sourceforge.stripes.controller.DispatcherServlet;
import net.sourceforge.stripes.controller.StripesFilter;

import com.google.inject.Singleton;

/**
 * 
 * @author <a href="mailto:jayuelm@gmail.com">Jayuel Maamo</a>
 * 
 */
public class ServletModule extends com.google.inject.servlet.ServletModule {
	@Override
	protected void configureServlets() {
		Map<String, String> params;

		params = new HashMap<String, String>();
		params.put("ActionResolver.Packages", "com.sample");
		params.put("ActionResolver.Class",
				"com.sample.stripes.ActionBeanGuicer");

		bind(StripesFilter.class).in(Singleton.class);
		bind(DispatcherServlet.class).in(Singleton.class);

		filter("/*").through(StripesFilter.class, params);
		serve("*.action").with(DispatcherServlet.class);
		serve("*.htm").with(DispatcherServlet.class);
	}

}
