package com.example.SoftBlues.controllers;

import com.example.SoftBlues.domain.album.Album;
import com.example.SoftBlues.domain.album.AlbumRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(path = "/album")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;


    @GetMapping
    public ResponseEntity getAllAlbums(){
        var allAlbums = albumRepository.findAll();
        return ResponseEntity.ok(allAlbums);
    }

    @GetMapping
    public Iterable<Album> getByArtistName(@PathVariable String artistName){
        return albumRepository.findByArtist(artistName);
    }

    @GetMapping
    public Iterable<Album> getByYearLaunch(@PathVariable String yearLaunch){
        return albumRepository.findByYearLaunch(yearLaunch);
    }

    @PostMapping
    public ResponseEntity registerAlbum(@Valid Album album){
        albumRepository.save(album);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateAlbum(@Valid Album album){
        Optional<Album> optionalAlbum = albumRepository.findById(album.getId());
        if(optionalAlbum.isPresent()){
            albumRepository.save(album);
            return ResponseEntity.ok(album);
        }
        else return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity deleteAlbum(@Valid Album album){
        albumRepository.deleteById(album.getId());
        return ResponseEntity.ok("Album deletado com sucesso...");
    }

}
