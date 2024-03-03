package kz.pharmacy.springpharmacyproject.Models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "pharmacists")
public class Pharmacists {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer pharmacist_id;
    private String name;
    private String surname;
    private String phone_number;
    private String email;
    private String qualification;

}
