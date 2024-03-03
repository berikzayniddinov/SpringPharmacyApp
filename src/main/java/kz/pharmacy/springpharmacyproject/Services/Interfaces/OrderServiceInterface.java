package kz.pharmacy.springpharmacyproject.Services.Interfaces;

import kz.pharmacy.springpharmacyproject.Models.Orders;

import java.util.List;

public interface OrderServiceInterface {
    List<Orders> getAllOrders();
    Orders addOrder(Orders orders);
}
