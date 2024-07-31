package com.projectcourse.services;

import com.projectcourse.entities.Product;
import com.projectcourse.entities.User;
import com.projectcourse.repositories.ProductRepository;
import com.projectcourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById (Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
