package com.programming.productservice.modul;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "document")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private String price;

}
