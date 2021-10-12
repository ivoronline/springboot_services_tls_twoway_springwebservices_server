package com.ivoronline.springboot_services_tls_twoway_springwebservices_server;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

  //===============================================================================
  // WEB SERVICE ENDPOINT (URL)
  //===============================================================================
  @Bean
  public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {

    //CREATE SERVLET
    MessageDispatcherServlet  servlet = new MessageDispatcherServlet();
                              servlet.setApplicationContext(applicationContext);
                              servlet.setTransformWsdlLocations(true);

    //RETURN SERVLET-ENDPOINT CONNECTION
    return new ServletRegistrationBean<>(servlet, "/PersonWebService");

  }

}