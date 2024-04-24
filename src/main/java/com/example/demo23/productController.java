package com.example.demo23;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {
    @Autowired
    private ProductServies service;

    @GetMapping("/home")
    public String home() {
        return "display checking ";

    }

    @GetMapping("/products")
    public <Product> List<Product> list() {
        List<Product> courses;
        courses = (List<Product>) this.service.listAll();
        return courses;

    }

    @PostMapping("/products")
    public void add(@RequestBody product product) {
        service.save(product);
        System.out.println("okk");

    }

//
//
//    @PutMapping("/products/{id}")
//    public <Product extends product>  String update(@RequestBody Product product, @PathVariable Integer id) {
//        com.example.demo23.product existProduct = service.get(id);
//        service.save(product);
//
//        return "update";
//
//    }
//
//    @GetMapping("/products/{id}")
//    public <Product> product get(@PathVariable Integer id) {
//        var product = service.get(id);
//        final com.example.demo23.product product1 = product;
//        return product1;
//    }
//
//    @DeleteMapping("/products/{id}")
//    public void delete(@PathVariable Integer id) {
//        service.delete(id);
//    }



}













