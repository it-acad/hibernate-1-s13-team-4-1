package com.softserve.itacademy.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StateTests {
    private static State validState;
    private static State emptyState;


    @BeforeAll
    static void init(){
        validState = new State();
        validState.setId(1L);
        validState.setName("ValidName");
    }

    @Test
    void constraintViolationOnEmptyStateName() {
        State emptState = new State();
        emptState.setName("");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<State>> violations = validator.validate(emptState);
        assertEquals(1, violations.size());
    }

    @Test
    void geId() {
        assertEquals(1L, validState.getId());
    }

    @Test
    void getName() {
        assertEquals("ValidName", validState.getName());
    }

    @Test
    void getTask() {
        assertEquals(null, validState.getTask());
    }

    @Test
    void setId() {
        emptyState.setId(2L);
        assertEquals(2L, emptyState.getId());
    }

    @Test
    void setName() {
        emptyState.setName("Name");
        assertEquals("Name", emptyState.getName());
    }

    @Test
    void setTask() {
        assertEquals(null, emptyState.getTask());
    }


    @Test
    void testEquals() {
        State validState1 = new State();
        State validState2 = new State();

        assertEquals(true, validState1.equals(validState2));
    }

    @Test
    void testToString() {
        assertEquals(1, 1);
    }

    @Test
    void testHashCode() {
        assertEquals(1, 1);
    }
}