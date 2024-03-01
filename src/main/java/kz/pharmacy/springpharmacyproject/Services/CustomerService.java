package kz.pharmacy.springpharmacyproject.Services;

import kz.pharmacy.springpharmacyproject.Models.Customers;
import kz.pharmacy.springpharmacyproject.Repositories.CustomerRepository;
import kz.pharmacy.springpharmacyproject.Services.Interfaces.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class CustomerService  implements CustomerServiceInterface {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customers registerCustomer(Customers customers) {
        return customerRepository.save(customers);
    }


    public Optional<Customers> authenticateCustomer(String firstName, String phoneNumber) {
        return customerRepository.findByFirstNameAndPhoneNumber(firstName, phoneNumber);
    }

    @Override
    public List<Customers> findAllCustomers() {
        return customerRepository.findAll();
    }
    @Override
    public Optional<Customers> findById(Integer customer_id){
        return customerRepository.findById(customer_id);
    }
}
