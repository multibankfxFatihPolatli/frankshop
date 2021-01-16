package com.frankshop.api.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Warehouse extends BaseDomain {

    public String id;

    public String name;

    private WarehouseLocation location;

    private Cars cars;
}
