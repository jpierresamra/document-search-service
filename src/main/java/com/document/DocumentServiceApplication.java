package com.document;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class DocumentServiceApplication
{
	
	@Bean
	MessageSource messageSource() {
	    Locale.setDefault(Locale.ENGLISH);
	    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.addBasenames("classpath:messages");
	    return messageSource;
	}
	
	public static void main(String[] args)
	{
		SpringApplication.run(DocumentServiceApplication.class, args);
	}
}
