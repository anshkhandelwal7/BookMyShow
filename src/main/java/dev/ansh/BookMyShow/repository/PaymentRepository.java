package dev.ansh.BookMyShow.repository;

import dev.ansh.BookMyShow.model.City;
import dev.ansh.BookMyShow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
