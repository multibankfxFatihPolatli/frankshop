package com.frankshop.api.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WarehouseLocation extends BaseDomain {

    public  String latitute;

    public  String longitute;
}
