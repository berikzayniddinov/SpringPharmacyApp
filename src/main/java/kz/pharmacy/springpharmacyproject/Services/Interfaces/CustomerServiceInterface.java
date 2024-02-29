package kz.pharmacy.springpharmacyproject.Services.Interfaces;

import kz.pharmacy.springpharmacyproject.Models.Customers;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceInterface {
    Customers registerCustomer(Customers customers);
    Optional<Customers> authenticateCustomer(String firstName, String phoneNumber);
    List<Customers> findAllCustomers();
}
