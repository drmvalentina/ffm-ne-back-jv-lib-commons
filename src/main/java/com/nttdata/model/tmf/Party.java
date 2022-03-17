package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

/**
 * Related Entity reference. A related party defines party or party role linked to a specific entity.
 */
@JsonTypeName("Party")
@Data
public class Party {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("role")
    private String role;
    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;
    @JsonProperty("@baseType")
    private String _atBaseType;
    @JsonProperty("@type")
    private String _atType;
    @JsonProperty("@referredType")
    private String _atReferredType;
}
