package dev.ansh.BookMyShow.model;

import dev.ansh.BookMyShow.constant.MovieFeature;
import jakarta.persistence.*;

import java.util.List;

public class Movie extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private MovieFeature movieFeatures;
    public Movie() {}
    public Movie(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
