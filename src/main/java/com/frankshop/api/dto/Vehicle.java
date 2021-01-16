package com.frankshop.api.dto;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Vehicle extends BaseDto {

    public String _id;

    public String make;

    public String model;

    public Integer year;

    public Double price;

    public Boolean licensed;

    public Date dateAdded;

    public String locationId;
}
