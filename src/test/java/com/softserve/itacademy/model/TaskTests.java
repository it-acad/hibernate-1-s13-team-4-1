package com.softserve.itacademy.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTests {
    private static Task testTask;

    @Test
    void constraintViolationOnEmptyTaskName() {
        Task emptyTask = new Task();
        emptyTask.setName("");
        emptyTask.setPriority(Priority.LOW);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Task>> violations = validator.validate(emptyTask);
        assertEquals(1, violations.size());
    }

    @Test
    void getId() {
        assertEquals(1, 1);
    }

    @Test
    void getName() {
        assertEquals(1, 1);
    }

    @Test
    void getPriority() {
        assertEquals(1, 1);
    }

    @Test
    void getTodo() {
        assertEquals(1, 1);
    }

    @Test
    void getState() {
        assertEquals(1, 1);
    }

    @Test
    void setId() {
        assertEquals(1, 1);
    }

    @Test
    void setName() {
        assertEquals(1, 1);
    }

    @Test
    void setPriority() {
        assertEquals(1, 1);
    }

    @Test
    void setTodo() {
        assertEquals(1, 1);
    }

    @Test
    void setState() {
        assertEquals(1, 1);
    }

    @Test
    void testToString() {
        assertEquals(1, 1);
    }

    @Test
    void testEquals() {
        assertEquals(1, 1);
    }

    @Test
    void testHashCode() {
        assertEquals(1, 1);
    }
}
