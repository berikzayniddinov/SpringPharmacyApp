package kz.pharmacy.springpharmacyproject.Models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private String firstName;
    private String lastName;
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;
}