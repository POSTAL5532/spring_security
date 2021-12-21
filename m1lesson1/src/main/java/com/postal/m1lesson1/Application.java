package com.postal.m1lesson1;

import com.postal.m1lesson1.persistence.model.User;
import com.postal.m1lesson1.persistence.repository.InMemoryUserRepository;
import com.postal.m1lesson1.persistence.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;

/**
 * @author SIE
 */
@SpringBootApplication
public class Application {

    @Bean
    public Converter<String, User> messageConverter() {
        return new Converter<String, User>() {
            @Override
            public User convert(String id) {
                return userRepository().findUser(Long.valueOf(id));
            }
        };
    }

    @Bean
    public UserRepository userRepository() {
        return new InMemoryUserRepository();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
