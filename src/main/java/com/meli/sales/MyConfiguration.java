package com.meli.sales;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

  @Bean(name = "healthCheck")
  public String healthCheck(){
    return "pong";
  }

}
