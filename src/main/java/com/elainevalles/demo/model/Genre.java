package com.elainevalles.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="tgenres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    private String description;

    public Genre () {

    }

    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Genre(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override // Important to see the @Overide in attributes to output String as output through sout
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
