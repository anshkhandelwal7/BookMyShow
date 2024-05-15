package dev.ansh.BookMyShow.repository;

import dev.ansh.BookMyShow.model.City;
import dev.ansh.BookMyShow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findByTitle(String title);
}
