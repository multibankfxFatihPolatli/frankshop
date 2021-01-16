package com.frankshop.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WarehouseLocation extends BaseDto {

    public String latitute;

    public String longitute;
}
