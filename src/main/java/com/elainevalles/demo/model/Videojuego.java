package com.elainevalles.demo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="tvideojuego")
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String platform;
    private boolean multiplayer;
    @Column(name="pvp")
    private BigDecimal price;
    @Transient // Doesn't get saved to the database' the field is transient the var status
    private boolean status;

    public Videojuego() { // empty constructor for JPA
    }

    public Videojuego(boolean status, BigDecimal price, boolean multiplayer, String platform, String title) { // Doesn't need an ID'
        this.status = status;
        this.price = price;
        this.multiplayer = multiplayer;
        this.platform = platform;
        this.title = title;
    }

    public Videojuego(int id, String title, String platform, boolean multiplayer, BigDecimal price, boolean status) { // Need an ID and all the other fields
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.multiplayer = multiplayer;
        this.price = price;
        this.status = status;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
