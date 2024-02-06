package com.example.SoftBlues.domain.album;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface AlbumRepository  extends JpaRepository<Album, String> {

    public Iterable<Album> findByArtist(String artist);
    public Iterable<Album> findByYearLaunch(String year);

}
