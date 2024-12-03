package com.ecommerce.project.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private Long addressId;
    @NotBlank
    @Size(min = 5,message = "Street name must be least 5 characters")
    private String street;
    @NotBlank
    @Size(min = 5,message = "Building name must be least 5 characters")
    private String buildingName;
    @NotBlank
    @Size(min = 4,message = "City name must be least 4 characters")
    private String city;
    @NotBlank
    @Size(min = 2,message = "State name must be least 2 characters")
    private String state;
    @NotBlank
    @Size(min = 2,message = "Country name must be least 5 characters")
    private String country;
    @NotBlank
    @Size(min = 6,message = "Pin code  must be least 6 characters")
    private String pincode;
}