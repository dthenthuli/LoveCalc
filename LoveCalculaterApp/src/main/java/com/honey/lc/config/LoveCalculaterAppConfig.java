package com.honey.lc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.honey.lc.convator.CreditCardCovator;
import com.honey.lc.convator.CreditConverterObjectToString;
import com.honey.lc.formatter.CreditCardFormatter;
import com.honey.lc.formatter.CurrencyFormatter;
import com.honey.lc.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.honey.lc.controllers")
public class LoveCalculaterAppConfig implements WebMvcConfigurer{

	@Bean
	public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;

	}
	@Bean
	public MessageSource messageSource() {
		System.out.println("inside messageSource");
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.addBasenames("message");
		return messageSource;
	} 
	
	@Bean
	public LocalValidatorFactoryBean validator() {
		System.out.println("inside Validator");
		LocalValidatorFactoryBean localv=new LocalValidatorFactoryBean();
		localv.setValidationMessageSource(messageSource());
	return localv;
	}	
	 public Validator getValidator(){
		 System.out.println("inside getValidator");
		return validator();
		
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("inside add formatter method	");
		registry.addFormatter(new PhoneNumberFormatter());
		// ''   registry.addFormatter(new CreditCardFormatter());
		registry.addConverter(new CreditCardCovator());
		registry.addConverter(new CreditConverterObjectToString());
		registry.addFormatter(new CurrencyFormatter());
	}

}
