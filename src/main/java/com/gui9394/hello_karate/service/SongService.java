package com.gui9394.hello_karate.service;

import java.util.Arrays;
import java.util.List;

import com.gui9394.hello_karate.model.Song;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SongService {

    private List<Song> songs = Arrays.asList(
            new Song(1, "Bohemian Rhapsody", "Queen"), 
            new Song(2, "The Phantom Of The Opera", "Nightwish"),
            new Song(3, "Toxicity", "System Of A Down"), 
            new Song(4, "Street Of Dreams", "Guns N' Roses")
    );

    public List<Song> getAll() {
        log.info("Buscar todas as músicas");

        return songs;
    }

    public Song getSong(Integer id) {
        log.info("Buscando música {}", id);

        return songs.stream()
                .filter(song -> id.equals(song.getId()))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Música não encontrada"));
    }

}