package com.webspa.app.dtos;


import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Data @Builder
public class ProductDto {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private double price;
    @NotNull
    private int quantity;
    @NotNull
    private String category;

}
