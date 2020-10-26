package com.honey.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer //implements WebApplicationInitializer
{

	
	public void onStartup(ServletContext servletContext) throws ServletException {

		/*
		 * XmlWebApplicationContext wepappcon = new XmlWebApplicationContext();
		 * wepappcon.setConfigLocation("classpath:app-config.xml");
		 */

		AnnotationConfigWebApplicationContext wepappcon = new AnnotationConfigWebApplicationContext();
		wepappcon.register(LoveCalculaterAppConfig.class);

		// create dispatcher servlet Obj
		DispatcherServlet ds = new DispatcherServlet(wepappcon);

		// register dispatcher servlet obj in servlet context
		ServletRegistration.Dynamic sd = servletContext.addServlet("Mydispatcher", ds);
		sd.setLoadOnStartup(1);
		sd.addMapping("/website/*");

	}

}
