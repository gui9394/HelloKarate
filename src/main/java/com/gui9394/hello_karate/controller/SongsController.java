package com.gui9394.hello_karate.controller;

import java.util.Collection;

import com.gui9394.hello_karate.model.Song;
import com.gui9394.hello_karate.service.SongService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("songs")
@AllArgsConstructor
public class SongsController {

    private SongService songService;

    @GetMapping
    public ResponseEntity<Collection<Song>> getSongs() {
        return ResponseEntity.ok(songService.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Song> getSong(@PathVariable Integer id) {
        return ResponseEntity.ok(songService.getSong(id));
    }

}