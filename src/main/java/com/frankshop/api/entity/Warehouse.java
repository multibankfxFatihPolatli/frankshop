package com.frankshop.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Document(collection = "warehouse")
public class Warehouse extends BaseEntity {

    @Id
    public String id;

    public String name;

    private WarehouseLocation location;

    private Cars cars;
}
