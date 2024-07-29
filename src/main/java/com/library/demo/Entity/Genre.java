package com.library.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Genre {
    @Id
    Integer genre_id;

    private String genre_name;
    private String description;

    @ManyToMany
    Set<Book> includingBooks;

    public Genre(String genre_name, String description) {
        this.genre_name = genre_name;
        this.description = description;
    }

    public Genre() {
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
