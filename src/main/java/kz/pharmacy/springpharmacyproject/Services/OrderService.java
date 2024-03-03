package kz.pharmacy.springpharmacyproject.Services;

import kz.pharmacy.springpharmacyproject.Models.Orders;
import kz.pharmacy.springpharmacyproject.Repositories.OrderRepository;
import kz.pharmacy.springpharmacyproject.Services.Interfaces.OrderServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderServiceInterface {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }
    @Override
    public Orders addOrder(Orders order) {
        return orderRepository.save(order);
    }

}
