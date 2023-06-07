package com.example.demojpa.controller;

import com.example.demojpa.dto.ProductRequest;
import com.example.demojpa.dto.ProductResponse;
import com.example.demojpa.repository.ProductRepository;
import com.example.demojpa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;

  @Autowired
  ProductRepository repository;

  @PostMapping
  public void create(@RequestBody ProductRequest request) {
    productService.create(request);
  }
}
