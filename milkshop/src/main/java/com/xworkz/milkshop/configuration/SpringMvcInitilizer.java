package com.xworkz.milkshop.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {
	public SpringMvcInitilizer() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	private String[] getServletMappings = { "/" };
	private Class[] getServletConfigClasses = { SpringConfiguration.class, DBConfiguration.class };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		return getServletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		return getServletMappings;
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Calling configureDefaultServletHandling Method");
		configurer.enable();
		
	}
}