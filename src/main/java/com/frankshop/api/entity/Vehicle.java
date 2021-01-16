package com.frankshop.api.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Document(collection = "vehicles")
public class Vehicle extends BaseEntity {

    public String _id;

    public String make;

    public String model;

    public Integer year;

    public Double price;

    public Boolean licensed;

    public Date dateAdded;

    public String locationId;
}
