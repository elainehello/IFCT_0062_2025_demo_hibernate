package com.elainevalles.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="tvideojuego")
public class Videojuego {
    private int id;
    private String title;
    private String platform;
    private boolean multiplayer;
    private BigDecimal price;

    public Videojuego() { // empty constructor for JPA
    }

    public Videojuego(String title, String platform, boolean multiplayer, BigDecimal price) { // Doesnt need an ID
        this.title = title;
        this.platform = platform;
        this.multiplayer = multiplayer;
        this.price = price;
    }

    public Videojuego(int id, String title, String platform, boolean multiplayer, BigDecimal price) { // Need an ID and all the other fields
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.multiplayer = multiplayer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
