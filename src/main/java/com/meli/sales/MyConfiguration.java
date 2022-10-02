package com.meli.sales;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfiguration {

  @Bean(name = "healthCheck")
  public String healthCheck(){
    return "pong";
  }

  @Bean
  @Profile("development")
  public CommandLineRunner execute(){
    return args -> System.out.println("running configuration");
  }

}
