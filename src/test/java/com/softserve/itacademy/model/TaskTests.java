package com.softserve.itacademy.model;

import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTests {

//    @Test
//    void userWithValidEmail() {
//        Task = new Task();
//        task.setEmail("rty5@i.ua");
//        task.setFirstName("Valid-Name");
//        task.setLastName("Valid-Name");
//        task.setPassword("qwQW12!@");
//        task.setRole(traineeRole);
//
//
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//        Set<ConstraintViolation<task>> violations = validator.validate(task);
//
//        assertEquals(0, violations.size());
//    }

    @Test
    void constraintViolationOnEmptyTaskName() {
        State emptyState = new State();
        emptyState.setName("");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<State>> violations = validator.validate(emptyState);
        assertEquals(1, violations.size());
    }

    @Test
    void getId() {
    }

    @Test
    void getName() {
    }

    @Test
    void getPriority() {
    }

    @Test
    void getTodo() {
    }

    @Test
    void getState() {
    }

    @Test
    void setId() {
    }

    @Test
    void setName() {
    }

    @Test
    void setPriority() {
    }

    @Test
    void setTodo() {
    }

    @Test
    void setState() {
    }
}
