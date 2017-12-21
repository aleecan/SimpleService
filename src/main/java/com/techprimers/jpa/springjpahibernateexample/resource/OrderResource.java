package com.techprimers.jpa.springjpahibernateexample.resource;

import com.techprimers.jpa.springjpahibernateexample.model.Order;
import com.techprimers.jpa.springjpahibernateexample.model.Products;
import com.techprimers.jpa.springjpahibernateexample.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/order")
public class OrderResource {


    @Autowired
    OrderRepository orderRepository;


    @RequestMapping("/all")
    public List<Order> getAll(){
        return orderRepository.findAll();
    }


    @RequestMapping("/add")
    public Order save(@RequestBody Order order){
        return orderRepository.save(order);
    }

}
