package kz.pharmacy.springpharmacyproject.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name =  "orders")

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;
    private Integer customer_id;
    private String medicine_name;
    private String order_date;
    private String total_amount;
    private String status;
    private String delivery_address;
    private String payment_method;
}
