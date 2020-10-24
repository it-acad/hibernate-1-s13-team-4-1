package com.softserve.itacademy.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootTest
public class ToDoTests {

    @Test
    void checkCreatedTest() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertEquals(1, toDo.getId());
    }

    @Test
    void checkGetTitle() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertEquals("Title", toDo.getTitle());
    }

    @Test
    void checkGetOwner() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertEquals(user, toDo.getOwner());
    }


    @Test
    void checkGetDate() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertEquals(toDo.getCreatedAt(), toDo.getCreatedAt());
    }


    @Test
    void checkGetCollaborators() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertEquals(toDo.getCollaborators(), toDo.getCollaborators());
    }

    @Test
    void checkGetTasks() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertEquals(toDo.getTasks(), toDo.getTasks());
    }
    @Test
    void checkToString() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertEquals(toDo.toString(), toDo.toString());
    }

    @Test
    void checkHashCode() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertEquals(toDo.hashCode(), toDo.hashCode());
    }

    @Test
    void checkEquals() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        ToDo toDo2 = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertNotEquals(toDo2, toDo);
    }


    @Test
    void checkTitleEquals() {
        User user = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        ToDo toDo2 = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title32");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertNotEquals(toDo2.getTitle(), toDo.getTitle());
    }

    @Test
    void checkOwnerEquals() {
        User user = new User();
        User user2 = new User();
        ToDo toDo = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        ToDo toDo2 = new ToDo();
        toDo.setId(1L);
        toDo.setTitle("Title32");
        toDo.setOwner(user);
        toDo.setCollaborators(new ArrayList<>());
        toDo.setCreatedAt(LocalDateTime.now());
        toDo.setTasks(new ArrayList<>());
        assertNotEquals(toDo2.getOwner(), toDo.getOwner());
    }
