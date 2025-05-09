package com.elainevalles.demo;

import com.elainevalles.demo.model.Genre;
import com.elainevalles.demo.model.Studio;
import com.elainevalles.demo.model.StudioPK;
import com.elainevalles.demo.model.Videogame;
import com.elainevalles.demo.repository.GenreDAO;
import com.elainevalles.demo.repository.StudioDAO;
import com.elainevalles.demo.repository.VideogameDAO;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // CREATE GENRE MUST-BE
//        Genre genre = GenreDAO.read(1);
//        Videogame doom = new Videogame("Doom", "PC", true, 100, true, genre);
//        VideogameDAO.create(doom);

        // CREATE VIDEOGAME
//        Videogame cod = new Videogame("Amoung us", "PS4", true, 40, true);
//        VideogameDAO.Create(cod);
//        Videogame cod2 = new Videogame("HALO", "PS4", true, 80, true);
//        VideogameDAO.Create(cod2);
//        Videogame cod3 = new Videogame("Gunbounds", "PS4", true, 140, true);
//        VideogameDAO.Create(cod3);
//        Videogame cod4 = new Videogame("Plato", "PS4", true, 20, true);
//        VideogameDAO.Create(cod4);

        // READ-ALL
//        List<Videogame> videogames = VideogameDAO.readAll();
//        videogames.forEach(System.out::println);

        // READ VIDEOGAME
//        Videogame cod = VideogameDAO.Read(1);
//        System.out.println(cod);
//
//        // UPDATE VIDEOGAME
//        cod.setPlatform("Xbox 360");
//        VideogameDAO.Update(cod);

        // DELETE VIDEOGAME
//        Videogame cod = VideogameDAO.read(20);
//
//        VideogameDAO.delete(cod); // Does require fixing


        // CREATE GENRE
//        Genre Adventure = new Genre("Adventure", "A story with a twist");
//        GenreDAO.Create(Adventure);

        // SEARCH BY PLATFORM
//        List<Videogame> videogames = VideogameDAO.findByPlatform("PS4");
//        System.out.println("After search:");
//        videogames.forEach(System.out::println);

        // CREATE GENRE
//            Genre Adventure = new Genre("Adventure", "A story with a twist");
//            GenreDAO.create(Adventure);
//        Videogame videog = new Videogame("GTA V", "PC", true, 100, true, new Genre(1, "Action", "A story with a twist"));
//        VideogameDAO.create(videog);
//        Videogame vd = VideogameDAO.read(1);
//        System.out.println(vd);
//        System.out.println(vd.getGenre().getDescription());


        // CREATE STUDIO
        // Step 1: Create the composite key
//        StudioPK studioPK = new StudioPK("12345", 88);
//
//        // Step 2: Create the Studio entity
//        Studio studio = new Studio(studioPK, "El Estudio", "USA");
//        StudioDAO.create(studio);
    }
}