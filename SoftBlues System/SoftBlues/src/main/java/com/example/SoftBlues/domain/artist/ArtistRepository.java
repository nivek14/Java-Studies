package com.example.SoftBlues.domain.artist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, String > {

    public Iterable<Artist> findByName(String name);

}
