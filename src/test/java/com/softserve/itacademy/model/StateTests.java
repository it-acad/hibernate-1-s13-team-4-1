package com.softserve.itacademy.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class StateTests {
    private static State validState;

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
        assertEquals(3, violations.size());
    }

    @Test
    void testGetId() {
        State emptyState = new State();
        emptyState.setId(2L);
        emptyState.setName("Name");
        assertEquals(1L, validState.getId());
    }

    @Test
    void testGetName() {
        State emptyState = new State();
        emptyState.setId(2L);
        emptyState.setName("Name");
        assertEquals("ValidName", validState.getName());
    }

    @Test
    void testGetTask() {
        State emptyState = new State();
        emptyState.setId(2L);
        emptyState.setName("Name");assertEquals(null, validState.getTask());
    }

    @Test
    void testSetId() {
        State emptyState = new State();
        emptyState.setId(2L);
        emptyState.setName("Name");
        assertEquals(2L, emptyState.getId());
    }

    @Test
    void testSetName() {
        State emptyState = new State();
        emptyState.setId(2L);
        emptyState.setName("Name");
        assertEquals("Name", emptyState.getName());
    }

    @Test
    void testSetTask() {
        State emptyState = new State();
        emptyState.setId(2L);
        emptyState.setName("Name");
        Task task = new Task();
        assertEquals(null, emptyState.getTask());
    }


    @Test
    void testEqualsStates() {
        State validState1 = new State();
        State validState2 = new State();
        assertEquals(false, validState1.equals(validState2));
    }

    @Test
    void testToString() {
        State emptyState = new State();
        emptyState.setId(2L);
        emptyState.setName("Name");
        Task task = new Task();
        assertEquals(emptyState.toString(), emptyState.toString());
    }

    @Test
    void testHashCode() {
        State emptyState = new State();
        emptyState.setId(2L);
        emptyState.setName("Name");
        Task task = new Task();
        assertEquals(emptyState.hashCode(), emptyState.hashCode());
    }
}
