package com.softserve.itacademy.model;


import lombok.*;
import java.util.List;
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
@Table(name = "states")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private Long id;

    @NotNull
    @Size(min = 1, max = 20, message = "wrong name`s size")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_@#$%^&+=])")
    private String name;

    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    private List<Task> task;

}
