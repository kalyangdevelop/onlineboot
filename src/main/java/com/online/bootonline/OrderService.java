package com.online.bootonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public Order createOrder (Order o){
        return orderRepository.save(o);
    }
    public Order updateOrder (Order o){
        return orderRepository.save(o);
    }
    public void deleteOrder(Order o){
        orderRepository.delete(o);

    }

    public List<Order> getAllOrders(){
        List<Order> list = new ArrayList<>();
        orderRepository.findAll().forEach(new Consumer<Order>() {
            @Override
            public void accept(Order o) {
                list.add(o);
            }
        });
        return list;
    }
}