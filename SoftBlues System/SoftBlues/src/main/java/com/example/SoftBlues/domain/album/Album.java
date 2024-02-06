package com.example.SoftBlues.domain.album;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "album")
@Entity(name = "album")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotBlank
    private String albumName;

    @NotBlank
    private String songs;

    @NotBlank
    private String artist;

//    @Lob
//    private Byte[] coverImage;

    @NotNull
    private String yearLaunch;


}
