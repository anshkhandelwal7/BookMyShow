package dev.ansh.BookMyShow.repository;

import dev.ansh.BookMyShow.model.Auditorium;
import dev.ansh.BookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer> {
    Auditorium findAuditoriumByName(String name);
}
