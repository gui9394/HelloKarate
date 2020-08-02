package com.gui9394.hello_karate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Song {

    private Integer id;
    private String title;
    private String artist;

}
