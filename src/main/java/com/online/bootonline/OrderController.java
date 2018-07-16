package com.online.bootonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;
    @RequestMapping(value = "/orders", method= RequestMethod.GET)
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();

    }
    @RequestMapping(value="/orders", method=RequestMethod.POST)
    public void createOrder (@RequestBody Order o){
        orderService.createOrder(o);
    }

    @RequestMapping(value="/orders", method=RequestMethod.DELETE)
    public void deleteOrder(@RequestBody Order o) {
        orderService.deleteOrder(o);
    }
    @RequestMapping(value="/orders", method=RequestMethod.PUT)
    public void updateOrder (@RequestBody Order o){
        orderService.updateOrder(o);
    }
}

