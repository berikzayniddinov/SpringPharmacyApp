package kz.pharmacy.springpharmacyproject.Repositories;

import kz.pharmacy.springpharmacyproject.Models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface CustomerRepository extends JpaRepository<Customers, Integer> {


    Optional<Customers> findByFirstNameAndPhoneNumber(String firstName, String phoneNumber);
}
