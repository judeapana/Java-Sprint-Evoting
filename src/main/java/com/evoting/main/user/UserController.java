package com.evoting.main.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return null;
    }

    @GetMapping("/users/{uuid}")
    public User getUser(@PathVariable UUID uuid) {
        return null;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody List<User> users) {
        return null;
    }

    @DeleteMapping("/users")
    public User deleteUser(@RequestBody List<UUID> uuids) {
        return null;
    }

}
