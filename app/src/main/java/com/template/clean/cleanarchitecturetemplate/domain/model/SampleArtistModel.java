package com.template.clean.cleanarchitecturetemplate.domain.model;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

public class SampleArtistModel {

    String name;
    String type;

    public SampleArtistModel(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
