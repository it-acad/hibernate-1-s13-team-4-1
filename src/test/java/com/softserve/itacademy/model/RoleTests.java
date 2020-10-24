package com.softserve.itacademy.model;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class RoleTests {

    @BeforeAll
    static void init() {
        Role validRole = new Role();
    }

    @Test
    void constraintViolationOnEmptyRoleName() {
        Role emptyRole = new Role();
        emptyRole.setName("");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Role>> violations = validator.validate(emptyRole);
        assertEquals(1, violations.size());
    }


    @Test
    void getName() {
        Role role = new Role();
        Role role2 = new Role();
        role.setName("Name1");
        role2.setName("Name2");
        role.setUsers(new ArrayList<>());
        role2.setUsers(new ArrayList<>());
        assertNotEquals(role.getName(), role2.getName());

    }


    @Test
    void checkUsers() {
        Role role = new Role();
        Role role2 = new Role();
        role.setName("Name1");
        role2.setName("Name2");
        role.setUsers(new ArrayList<>());
        role2.setUsers(new ArrayList<>());
        assertEquals(role.getUsers(), role2.getUsers());

    }

    @Test
    void checkHash() {
        Role role = new Role();
        Role role2 = new Role();
        role.setName("Name1");
        role2.setName("Name2");
        role.setUsers(new ArrayList<>());
        role2.setUsers(new ArrayList<>());
        assertNotEquals(role.hashCode(), role2.hashCode());

    }

    @Test
    void checkToString() {
        Role role = new Role();
        Role role2 = new Role();
        role.setName("Name1");
        role2.setName("Name2");
        role.setUsers(new ArrayList<>());
        role2.setUsers(new ArrayList<>());
        assertNotEquals(role.toString(), role2.toString());

    }
    @Test
    void checkEquals() {
        Role role = new Role();
        Role role2 = new Role();
        role.setName("Name1");
        role2.setName("Name2");
        role.setUsers(new ArrayList<>());
        role2.setUsers(new ArrayList<>());
        assertNotEquals(role, role2);

    }


}
