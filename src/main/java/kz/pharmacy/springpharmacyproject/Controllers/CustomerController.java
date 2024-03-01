package kz.pharmacy.springpharmacyproject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import kz.pharmacy.springpharmacyproject.Models.Customers;
import kz.pharmacy.springpharmacyproject.Services.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/register")
    public ResponseEntity<Customers> registerCustomer(@RequestBody Customers customer) {
        Customers registeredCustomer = customerService.registerCustomer(customer);
        return ResponseEntity.ok(registeredCustomer);
    }
    @PostMapping("/customers/authenticate")
    public Optional<Customers> authenticateCustomer(@RequestBody Customers customers) {
        return customerService.authenticateCustomer(customers.getFirstName(), customers.getPhoneNumber());
    }
    @GetMapping("/all")
    public ResponseEntity<List<Customers>> getAllCustomers() {
        List<Customers> customers = customerService.findAllCustomers();
        return ResponseEntity.ok(customers);
    }
    @GetMapping("/customer_id/{customer_id}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable Integer customer_id){
        Optional<Customers> customer = customerService.findById(customer_id);
        if (customer.isPresent()) {
            return ResponseEntity.ok(customer.get());
        }
        else{
            return ResponseEntity.notFound().build();
            }
        }
    @PostMapping("/addcustomer")
    public Customers addCustomer(@RequestBody Customers customers){
        return customerService.addCustomer(customers);
    }

}
