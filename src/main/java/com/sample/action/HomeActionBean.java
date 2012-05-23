package com.sample.action;

import com.google.inject.Inject;
import com.sample.service.Service;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 * 
 * @author <a href="mailto:jayuelm@gmail.com">Jayuel Maamo</a>
 * 
 */

@UrlBinding("/Home.htm")
public class HomeActionBean extends BaseActionBean {
	@Inject
	private Service service;

    @DefaultHandler
    public Resolution view() {
    	return new ForwardResolution("/WEB-INF/jsp/home.jsp");
    }

    public String getService() {
        return service.getName();
    }
    
    public String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public String getOsName() {
        return System.getProperty("os.name");
    }
}
