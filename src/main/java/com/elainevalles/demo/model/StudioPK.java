package com.elainevalles.demo.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Struct;

@Embeddable
public class StudioPK implements Serializable {
    private String namePK;
    private int prefix;

    public StudioPK() {

    }
    public StudioPK(String name, int prefix) {
        this.namePK = name;
        this.prefix = prefix;
    }
    public String getName() {
        return namePK;
    }
    public void setName(String name) {
        this.namePK = name;
    }
}
