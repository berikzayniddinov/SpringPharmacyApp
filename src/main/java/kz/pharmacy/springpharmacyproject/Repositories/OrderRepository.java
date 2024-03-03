package kz.pharmacy.springpharmacyproject.Repositories;

import kz.pharmacy.springpharmacyproject.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
