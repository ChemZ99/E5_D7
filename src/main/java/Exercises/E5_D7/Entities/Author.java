package Exercises.E5_D7.Entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Author {
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birth;
    private String avatar;
}
