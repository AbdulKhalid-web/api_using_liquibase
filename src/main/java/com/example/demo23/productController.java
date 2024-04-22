package com.example.demo23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {
    @Autowired
    private ProductServies service;

    @GetMapping("/home")
    public String home() {
        return "lets try to make fun with new task";

    }

    @GetMapping("/products")
    public <Product> List<Product> list() {
        List<Product> courses;
        courses = (List<Product>) this.service.listAll();
        return courses;

    }

//    // RESTful API methods for Retrieval operations
//
//    // RESTful API method for Create operation
//
//    // RESTful API method for Update operation
//
//    // RESTful API method for Delete operation
//
//
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













