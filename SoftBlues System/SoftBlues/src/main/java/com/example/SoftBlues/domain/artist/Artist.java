package com.example.SoftBlues.domain.artist;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Table(name = "artist")
@Entity(name = "artist")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotBlank
    private String artistName;

    @NotBlank
    private String artistDescription;


}
