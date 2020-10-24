package com.softserve.itacademy.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TaskTests {
    private static Task testTask;

    @BeforeAll
    static void init(){
        testTask = new Task();
        Object o = new Object();
    }

    @Test
    void constraintViolationOnEmptyTaskName() {
        Task emptyTask = new Task();
        emptyTask.setName("");
        emptyTask.setPriority(Priority.LOW);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Task>> violations = validator.validate(emptyTask);
        assertEquals(2, violations.size());
    }

    @Test
    void getId() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.hashCode(), emptyTask2.hashCode());
    }

    @Test
    void getName() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.getName(), emptyTask2.getName());
    }

    @Test
    void getPriority() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.getPriority(), emptyTask2.getPriority());
    }

    @Test
    void getTodo() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.hashCode(), emptyTask2.hashCode());
    }

    @Test
    void getState() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.hashCode(), emptyTask2.hashCode());
    }

    @Test
    void setId() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.getId(), emptyTask2.getId());
    }

    @Test
    void setName() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.getName(), emptyTask2.getName());
    }

    @Test
    void setPriority() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.getPriority(), emptyTask2.getPriority());
    }

    @Test
    void setTodo() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.hashCode(), emptyTask2.hashCode());
    }

    @Test
    void setState() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.hashCode(), emptyTask2.hashCode());
    }

    @Test
    void testToString() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.toString(), emptyTask2.toString());
    }

    @Test
    void testEquals() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertEquals(emptyTask1.hashCode(), emptyTask1.hashCode());
    }

    @Test
    void testHashCode() {
        Task emptyTask1 = new Task();
        emptyTask1.setId(1L);
        emptyTask1.setName("Task1");
        emptyTask1.setPriority(Priority.LOW);
        Task emptyTask2 = new Task();
        emptyTask2.setId(2L);
        emptyTask2.setName("Task2");
        emptyTask2.setPriority(Priority.HIGH);
        assertNotEquals(emptyTask1.hashCode(), emptyTask2.hashCode());
    }

//    @Test
//    void testEqualsObject(Object o) {
//        Task emptyTask1 = new Task();
//        emptyTask1.setId(1L);
//        emptyTask1.setName("Task1");
//        emptyTask1.setPriority(Priority.LOW);
//        Task emptyTask2 = testTask;
//        emptyTask2.setId(2L);
//        emptyTask2.setName("Task2");
//        emptyTask2.setPriority(Priority.HIGH);
//        assertEquals(o.hashCode(), o.hashCode());
//    }
}
