package com.softserve.itacademy.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "todos")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at")
    private Date createdAt;

    @NotBlank(message = "The title cannot be empty")
    @Column(nullable = false, unique = true)
    private String title;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id")
    private User owner;

    @ManyToMany(mappedBy = "todos", cascade = CascadeType.ALL)
    private List<ToDo_Collaborator> collaborators;


}
