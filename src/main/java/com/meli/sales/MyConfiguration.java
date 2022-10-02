package com.meli.sales;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MyConfiguration {

  @Bean(name = "healthCheck")
  public String healthCheck(){
    return "pong";
  }

  @Bean
  public CommandLineRunner execute(){
    return args -> System.out.println("running configuration");
  }

}
