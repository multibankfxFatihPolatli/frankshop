package com.frankshop.api.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import nonapi.io.github.classgraph.json.Id;

@Data
@EqualsAndHashCode(callSuper = false)
@Document(collection = "cart")
public class Cart extends BaseEntity {

    @Id
    private String id;

    private List<String> vehicles = new ArrayList<>();

    private String userId;
}
