package com.nttdata.model.tmf;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

/**
 * Place reference. Place defines the places where the products are sold or delivered.
 */
@JsonTypeName("Place")
@Data
public class Place {

    private String id;
    private String href;
    private String name;
    private String role;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@referredType")
    private String referredType;
}

