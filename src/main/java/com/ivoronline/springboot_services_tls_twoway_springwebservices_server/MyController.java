package com.ivoronline.springboot_services_tls_twoway_springwebservices_server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //=======================================================================================
  // GHELLO
  //=======================================================================================
  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Server";
  }

}
