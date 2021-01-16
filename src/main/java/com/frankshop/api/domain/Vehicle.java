package com.frankshop.api.domain;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Vehicle extends BaseDomain {

    public String _id;

    public String make;

    public String model;

    public Integer year;

    public Double price;

    public Boolean licensed;

    public Date dateAdded;

    public String locationId;
}
