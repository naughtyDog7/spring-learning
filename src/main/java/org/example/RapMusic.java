package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    private List<String> songs;

    private MusicGenre musicGenre = MusicGenre.RAP;

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public RapMusic() {
        this.songs = new ArrayList<>();
        songs.add("Sauce it up");
        songs.add("Robbery");
        songs.add("Emotionally scarred");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
