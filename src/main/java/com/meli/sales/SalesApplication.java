package com.meli.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SalesApplication {

  @Value("${application.name}")
  public String applicationName;
  @Autowired
  @Qualifier("healthCheck")
  public String healthCheck;

  @GetMapping("/ping")
  public String ping(){
    return healthCheck;
  }

  @GetMapping("/application-name")
  public String applicationName(){
    return applicationName;
  }

  public static void main(String[] args) {
    SpringApplication.run(SalesApplication.class, args);
  }

}
