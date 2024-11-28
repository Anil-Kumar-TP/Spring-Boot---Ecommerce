package com.ecommerce.project.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long productId;
    @NotBlank
    @Size(min = 3,message = "Product name must contain least 3 characters")
    private String productName;
    private String image;
    @NotBlank
    @Size(min = 6,message = "Product name must contain least 6 characters")
    private String description;
    private Integer quantity;
    private double price;
    private double specialPrice;
    private double discount;
}
