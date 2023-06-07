package com.example.demojpa.config;

import com.example.demojpa.repository.ProductRepository;
import com.example.demojpa.service.ProductService;
import com.example.demojpa.service.impl.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example")
public class AppConfig {
  @Bean
  public ProductService productService(ProductRepository repository) {
    return new ProductServiceImpl(repository);
  }
}
