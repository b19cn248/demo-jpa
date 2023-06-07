package com.example.demojpa.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.SqlResultSetMapping;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@SqlResultSetMapping(
      name = "ProductResponseMapping",
      classes = @ConstructorResult(
            targetClass = ProductResponse.class,
            columns = {
                  @ColumnResult(name = "product_id"),
                  @ColumnResult(name = "product_name"),
                  @ColumnResult(name = "product_description"),
                  @ColumnResult(name = "category_id"),
                  @ColumnResult(name = "category_name")
            }
      )
)
public class ProductResponse {
  private String productId;
  private String productName;
  private String productDescription;
  private String categoryId;
  private String categoryName;
}

