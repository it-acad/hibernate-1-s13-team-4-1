package com.softserve.itacademy.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserTests {

    private static Role mentorRole;
    private static Role traineeRole;
    private static User validUser;

    @BeforeAll
    static void init(){
        mentorRole = new Role();
        mentorRole.setName("MENTOR");
        traineeRole = new Role();
        traineeRole.setName("TRAINEE");
        validUser  = new User();
        validUser.setEmail("valid@cv.edu.ua");
        validUser.setFirstName("Valid-Name");
        validUser.setLastName("Valid-Name");
        validUser.setPassword("qwQW12!@");
        validUser.setRole(traineeRole);
    }

    @Test
    void userWithValidEmail() {
        User user = new User();
        user.setEmail("rty5@i.ua");
        user.setFirstName("Valid-Name");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);


        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        assertEquals(0, violations.size());
    }


    @Test
    void userWithInValidEmail() {
        User user = new User();
        user.setEmail("rty5i.ua");
        user.setFirstName("Valid-Name");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);


        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        assertEquals(1, violations.size());
    }

    @Test
    void createValidUser() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(validUser);

        assertEquals(0, violations.size());
    }

    @ParameterizedTest
    @MethodSource("provideInvalidEmailUser")
    void constraintViolationInvalid(String input, String errorValue) {
        User user = new User();
        user.setEmail(input);
        user.setFirstName("Valid-Name");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        assertEquals(1, violations.size());
        assertEquals(errorValue, violations.iterator().next().getInvalidValue());
    }

    private static Stream<Arguments> provideInvalidEmailUser(){
        return Stream.of(
                Arguments.of("invalidEmail", "invalidEmail"),
                Arguments.of("email@", "email@"),
                Arguments.of("", ""),
                Arguments.of("invalid", "invalid")
        );
    }

    @ParameterizedTest
    @MethodSource("provideInvalidFirstNameUser")
    void constraintViolationInvalidFirstName(String input, String errorValue) {
        User user = new User();
        user.setEmail(validUser.getEmail());
        user.setFirstName(input);
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        assertEquals(1, violations.size());
        assertEquals(errorValue, violations.iterator().next().getInvalidValue());
    }

    @ParameterizedTest
    @MethodSource("provideInvalidFirstNameUser")
    void constraintViolationInvalidLastName(String input, String errorValue) {
        User user = new User();
        user.setEmail(validUser.getEmail());
        user.setFirstName("Dmitriy");
        user.setLastName(input);
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        assertEquals(1, violations.size());
        assertEquals(errorValue, violations.iterator().next().getInvalidValue());
    }

    private static Stream<Arguments> provideInvalidFirstNameUser(){
        return Stream.of(
                Arguments.of("invalid", "invalid"),
                Arguments.of("Invalid-", "Invalid-"),
                Arguments.of("Invalid-invalid", "Invalid-invalid")
        );
    }

    @Test
    void checkIsUniq() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2.getEmail(), user.getEmail());
    }


    @Test
    void checkGetFirstName() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2.getFirstName(), user.getFirstName());
    }

    @Test
    void checkGetLastName() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2.getLastName(), user.getLastName());
    }

    @Test
    void checkGetPassword() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2.getPassword(), user.getPassword());
    }

    @Test
    void checkGetRole() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2.getRole(), user.getRole());
    }

    @Test
    void checkGetToDo() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        user.setToDo(new ArrayList<>());

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2.getToDo(), user.getToDo());
    }


    @Test
    void checkIsEqual() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2, user);
    }
    @Test
    void checkSetTodos() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        user.setOtherTodos(new ArrayList<>());

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2.getOtherTodos(), user.getOtherTodos());
    }

    @Test
    void checkHash() {
        User user = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        user.setOtherTodos(new ArrayList<>());

        User user2 = new User();
        user.setEmail("sreg@mail.ru");
        user.setFirstName("Dmitriy");
        user.setLastName("Valid-Name");
        user.setPassword("qwQW12!@");
        user.setRole(traineeRole);
        assertNotEquals(user2.hashCode(), user.hashCode());
    }
    @Test
    void checkString() {
        User user = new User();
        User user2 = new User();
        assertTrue(user.equals(user2));
    }





}
