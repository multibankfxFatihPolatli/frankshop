package com.frankshop.api.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import nonapi.io.github.classgraph.json.Id;

@Data
@EqualsAndHashCode(callSuper = false)
public class Cart extends BaseDto {

    @Id
    private String id;

    private List<String> vehicles;

    private String userId;
}
