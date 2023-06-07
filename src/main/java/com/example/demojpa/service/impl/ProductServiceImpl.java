package com.example.demojpa.service.impl;

import com.example.demojpa.dto.ProductRequest;
import com.example.demojpa.repository.ProductRepository;
import com.example.demojpa.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductServiceImpl implements ProductService {

  private final ProductRepository repository;

  public ProductServiceImpl(ProductRepository repository) {
    this.repository = repository;
  }

  @Override
  @Transactional
  public void create(ProductRequest request) {
    StringBuilder sb = new StringBuilder();
    for (String id : request.getCategoryIds()) sb.append(id + ",");
    String ids = sb.toString().substring(0, sb.length() - 1);
    log.info("Danh sach cac id : ", ids);
    repository.addProductWithCategories(request.getName(), request.getDescription(), ids);
  }
}
