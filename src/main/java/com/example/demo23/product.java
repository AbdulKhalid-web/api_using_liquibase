package com.example.demo23;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class product {

    private Integer id;
    private String name;
    private float price;

    public product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public product() {
    }
    public product(int a , int b){
        System.out.println("ljakl");
    }
    public product(int a , int b, int c){
        System.out.println("thats the ocmme to  the comit from new branch");
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public product(int a) {
        System.out.println("kahlsidsa oia");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}






