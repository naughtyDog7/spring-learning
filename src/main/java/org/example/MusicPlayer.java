package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {

    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        MusicGenre musicGenre;
        int genreNum = (int)(Math.random() * 3);
        switch (genreNum) {
            case 0:
                musicGenre = MusicGenre.CLASSICAL;
                break;
            case 1:
                musicGenre = MusicGenre.ROCK;
                break;
            case 2:
                musicGenre = MusicGenre.RAP;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + genreNum);
        }
        Music music = getMusicByGenre(musicGenre);
        if (music == null) {
            throw new IllegalStateException("Unexpected value: " + musicGenre);
        }
        List<String> musicList = music.getSongs();
        int random = (int)(musicList.size() * Math.random());
        return "Playing " + musicList.get(random) + " with volume " + volume;
    }

    private Music getMusicByGenre(MusicGenre genre) {
        for (Music music: musicList) {
            if (music.getMusicGenre() == genre) {
                return music;
            }
        }
        return null;
    }
}
