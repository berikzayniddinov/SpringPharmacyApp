package kz.pharmacy.springpharmacyproject.Controllers;

import kz.pharmacy.springpharmacyproject.Models.Orders;
import kz.pharmacy.springpharmacyproject.Services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    private OrderController(OrderService orderService){
        this.orderService=orderService;
    }
    @GetMapping("/all")
    public List<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }
    @PostMapping("/new")
    public Orders addOrder(@RequestBody Orders orders){
        return orderService.addOrder(orders);
    }
}
