package com.frankshop.api.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Cars {
    
    private String location;

    private List<Vehicle> vehicles;
}
