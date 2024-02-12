package com.example.SoftBlues.controllers;

import com.example.SoftBlues.domain.artist.Artist;
import com.example.SoftBlues.domain.artist.ArtistRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    private ArtistRepository artistRepository;

    @GetMapping
    public ResponseEntity getAllArtist(){
        var allArtist = artistRepository.findAll();
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Iterable<Artist> getByArtistName(@PathVariable String name){
        return artistRepository.findByName(name);
    }

    @PostMapping
    public ResponseEntity registerNewArtist(@Valid Artist artist){
        artistRepository.save(artist);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity updateArtist(@Valid Artist artist){
        Optional<Artist> optionalArtist = artistRepository.findById(artist.getId());
        if(optionalArtist.isPresent()){
            artistRepository.save(artist);
            return ResponseEntity.ok().build();
        }
        else return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity deleteArtist(@Valid Artist artist){
        artistRepository.deleteById(artist.getId());
        return ResponseEntity.ok().build();
    }

}
