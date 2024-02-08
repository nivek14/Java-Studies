package com.example.SoftBlues.domain.user;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Table(name = "userr")
@Entity(name = "userr")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String userName;

//    @NotBlank
//    private String password;

    @NotBlank
    private String email;

//    @ForeignKey
//    private boolean isSaved;


}
