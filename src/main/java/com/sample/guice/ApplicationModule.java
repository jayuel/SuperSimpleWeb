package com.sample.guice;

import com.google.inject.AbstractModule;
import com.sample.service.Service;

/**
 * 
 * @author <a href="mailto:jayuelm@gmail.com">Jayuel Maamo</a>
 * 
 */
public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Service.class).asEagerSingleton();
	}

}
