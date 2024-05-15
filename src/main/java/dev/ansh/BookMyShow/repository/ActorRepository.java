package dev.ansh.BookMyShow.repository;

import dev.ansh.BookMyShow.model.Actor;
import dev.ansh.BookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
