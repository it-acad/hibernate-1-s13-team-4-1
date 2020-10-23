package com.softserve.itacademy.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "todo_collaborator")
public class ToDo_Collaborator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long collaboratorId;

    @ManyToOne
    @JoinColumn(name = "todo_id")
    private ToDo toDo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User users;
}
