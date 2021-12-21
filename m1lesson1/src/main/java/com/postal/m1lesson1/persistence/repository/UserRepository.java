package com.postal.m1lesson1.persistence.repository;

import com.postal.m1lesson1.persistence.model.User;

/**
 * @author SIE
 */
public interface UserRepository {

    Iterable<User> findAll();

    User save(User user);

    User findUser(Long id);

    void deleteUser(Long id);

}
