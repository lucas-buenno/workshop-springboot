package com.projectcourse.repositories;

import com.projectcourse.entities.Product;
import com.projectcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
