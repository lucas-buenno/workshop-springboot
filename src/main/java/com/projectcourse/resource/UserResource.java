package com.projectcourse.resource;

import com.projectcourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<User> findAll() {
        User u = new User(1, "Maria", "maria@email.com","99999999","123456");
        return ResponseEntity.ok().body(u);
    }
}
