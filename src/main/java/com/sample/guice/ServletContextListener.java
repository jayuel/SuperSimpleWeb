package com.sample.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * 
 * @author <a href="mailto:jayuelm@gmail.com">Jayuel Maamo</a>
 * 
 */
public class ServletContextListener extends GuiceServletContextListener {
	Injector injector;

	@Override
	protected Injector getInjector() {
		if (injector == null) {
			injector = Guice.createInjector(new ServletModule(),
					new ApplicationModule());
		}
		return injector;
	}

}
