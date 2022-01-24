package com.morozov.lab3.repositories;

import com.morozov.lab3.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByLogin(String login);
}
