package com.filip.springbootmvccustomvalidation.models;

import com.filip.springbootmvccustomvalidation.repositories.UserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolation;
import java.util.Set;
import javax.validation.Validator;


import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Validator validator;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldValidateDuplicatedLogin() throws Exception {
        // given
        String login = "daniel";
        User predefinedUser = new User(login, "pass");
        userRepository.save(predefinedUser);
        // when
        User newUser = new User(login, "asd");
        Set<ConstraintViolation<User>> violations = validator.validate(newUser);
        // then
        assertEquals(1, violations.size());
    }

}