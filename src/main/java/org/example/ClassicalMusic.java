package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassicalMusic implements Music {

    private List<String> songs;
    private MusicGenre musicGenre = MusicGenre.CLASSICAL;

    public ClassicalMusic() {
        this.songs = new ArrayList<>();
        songs.add("Hungarian Rhapsody");
        songs.add("Moonlight Sonata");
        songs.add("Nuvole Bianche");
    }

    @Override
    public List<String> getSongs() {
        return Collections.unmodifiableList(songs);
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }
}
