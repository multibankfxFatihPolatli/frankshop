package com.frankshop.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Warehouse extends BaseDto {

    public String id;

    public String name;

    private WarehouseLocation location;

    private Cars cars;

}
