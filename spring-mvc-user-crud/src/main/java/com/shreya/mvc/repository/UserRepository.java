package com.shreya.mvc.repository;

import com.shreya.mvc.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final List<User> users = new ArrayList<>();
    private static int idCounter = 1;

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        user.setId(idCounter++); // Fix: assign auto-increment ID
        users.add(user);
    }
}
