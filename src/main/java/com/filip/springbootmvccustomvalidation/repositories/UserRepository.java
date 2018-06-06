package com.filip.springbootmvccustomvalidation.repositories;

import com.filip.springbootmvccustomvalidation.models.User;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private List<User> registeredUsers = new LinkedList<>();

    public void save(User user) {
        registeredUsers.add(user);
    }

    public Optional<User> findByLogin(String login) {
        return registeredUsers.stream()
                .filter(user -> user.getLogin().equals(login))
                .findFirst();
    }

}