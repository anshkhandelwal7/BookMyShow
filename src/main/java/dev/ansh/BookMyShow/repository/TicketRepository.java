package dev.ansh.BookMyShow.repository;

import dev.ansh.BookMyShow.model.City;
import dev.ansh.BookMyShow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
