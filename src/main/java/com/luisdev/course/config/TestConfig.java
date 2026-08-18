package com.luisdev.course.config;

import com.luisdev.course.entities.User;
import com.luisdev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Luis Fabiano", "luis@gmail.com", "988888888", "123456", null);
        User u2 = new User(null, "Rogers Garcia", "rogers@gmail.com", "977777777", "123456", null);

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
