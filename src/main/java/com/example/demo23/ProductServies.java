package com.example.demo23;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class ProductServies {

    @Autowired
    private ProductRepository repo;

    public List<product> listAll() {
        return repo.findAll();
    }

    public void save(product product) {
        repo.save(product);
    }


    public product get(Integer id) {
        return repo.findById(id).get();
    }


    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public void create(Integer id) {repo.equals(id);
    }
}


