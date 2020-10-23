package com.softserve.itacademy.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(min = 3, max = 200, message = "wrong name`s size")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_@#$%^&+=])")
    private String name;

    private Priority priority;


    @ManyToOne(optional = false)
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne(optional = false)
    @JoinColumn(name = "todo_id")
    private ToDo todo;


}
