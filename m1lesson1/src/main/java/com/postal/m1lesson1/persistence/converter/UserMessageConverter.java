package com.postal.m1lesson1.persistence.converter;

import com.postal.m1lesson1.persistence.model.User;
import com.postal.m1lesson1.persistence.repository.UserRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author SIE
 */
//@Component
public class UserMessageConverter implements Converter<String, User> {

    public final UserRepository userRepository;

    public UserMessageConverter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User convert(String id) {
        return this.userRepository.findUser(Long.valueOf(id));
    }
}
