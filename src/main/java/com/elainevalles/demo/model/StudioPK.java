package com.elainevalles.demo.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Struct;

@Embeddable
public class StudioPK implements Serializable {
    private String name;
    private String prefix;

    public StudioPK() {

    }
    public StudioPK(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
