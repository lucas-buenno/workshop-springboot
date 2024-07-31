package com.projectcourse.repositories;

import com.projectcourse.entities.OrderItem;
import com.projectcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
