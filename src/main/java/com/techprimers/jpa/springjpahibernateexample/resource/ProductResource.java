package com.techprimers.jpa.springjpahibernateexample.resource;

import com.techprimers.jpa.springjpahibernateexample.model.Employee;
import com.techprimers.jpa.springjpahibernateexample.model.Products;
import com.techprimers.jpa.springjpahibernateexample.repository.OrderRepository;
import com.techprimers.jpa.springjpahibernateexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rest/products")
public class ProductResource {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderRepository orderRepository;


    @GetMapping("/all")

    public List<Products> allPro(){
        return productRepository.findAll();
    }
    @PostMapping("/add")
    public Products save(@RequestBody Products products){
        return productRepository.save(products);
    }



}
