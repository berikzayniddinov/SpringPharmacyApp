package kz.pharmacy.springpharmacyproject.Models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "medicines")
public class Medicines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medicine_id;
    private String name;
    private String manufacturer;
    private String dosage;
    private String form;
    private double price;
}
