package dev.ansh.BookMyShow.repository;

import dev.ansh.BookMyShow.model.City;
import dev.ansh.BookMyShow.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {

    Theatre findTheatreByName(String theatreName);
}
