package com.example.demojpa.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Table(name = "products")
@Entity
public class Product {

  @Id
  private String id;
  private String name;
  private String description;
}
