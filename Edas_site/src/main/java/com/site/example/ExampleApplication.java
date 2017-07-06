package com.site.example;

//
//import org.springframework.boot.*;
//import org.springframework.boot.autoconfigure.*;
//import org.springframework.context.annotation.ComponentScan;  
//import org.springframework.context.annotation.Configuration;  
//import org.springframework.context.annotation.ImportResource;
//@SpringBootApplication  
//@Configuration    
//@ComponentScan(basePackages="com.site")   //默认扫描是当前包下的路径  
//@EnableAutoConfiguration    
//@ImportResource("classpath:META-INF/applicationContext.xml")
//public class ExampleApplication {
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(ExampleApplication.class, args);
//    }
//    
//}

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.boot.builder.SpringApplicationBuilder;  
import org.springframework.boot.web.support.SpringBootServletInitializer;  
import org.springframework.context.annotation.ComponentScan;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication  
@Configuration    
@ComponentScan(basePackages="com.site")   //默认扫描是当前包下的路径  
@EnableAutoConfiguration    
@ImportResource("classpath:META-INF/applicationContext.xml")
public class ExampleApplication extends SpringBootServletInitializer {  

  @Override  
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
      return application.sources(ExampleApplication.class);  
  }  

  public static void main(String[] args) throws Exception {  
      SpringApplication.run(ExampleApplication.class, args);  
  }  
}  

//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//
//import org.springframework.boot.context.web.SpringBootServletInitializer;
//import org.springframework.context.annotation.ImportResource;
//
//
//
//
//
//@SpringBootApplication
//
//@ImportResource("classpath:META-INF/applicationContext.xml")
//public class ExampleApplication extends SpringBootServletInitializer {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		SpringApplication.run(ExampleApplication.class, args);
//	}
//	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(ExampleApplication.class);
//    }
//	
////	@Override
////	public void onStartup(ServletContext servletContext) throws ServletException {
////		servletContext.addFilter("domainFilter", DomainFilter.class).addMappingForUrlPatterns(null, false, "/*");
////		super.onStartup(servletContext);
////
////	}
//
//}
