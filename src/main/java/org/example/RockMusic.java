package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RockMusic implements Music {
    private List<String> songs;

    private MusicGenre musicGenre = MusicGenre.ROCK;

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public RockMusic() {
        this.songs = new ArrayList<>();
        songs.add("First rock music");
        songs.add("Second rock music");
        songs.add("Third rock music");
    }

    @Override
    public List<String> getSongs() {
        return Collections.unmodifiableList(songs);
    }
}
