package com.frankshop.api.domain;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import nonapi.io.github.classgraph.json.Id;

@Data
@EqualsAndHashCode(callSuper = false)
public class Cart extends BaseDomain {

    @Id
    private String id;

    private List<String> vehicles;

    private String userId;
}
