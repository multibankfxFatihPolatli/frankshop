package com.frankshop.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WarehouseLocation extends BaseEntity {

    public String latitute;

    public String longitute;
}
