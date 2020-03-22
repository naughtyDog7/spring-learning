package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer\n" +
                "id=" + id +
                "\n" + musicPlayer.playMusic();
    }

    @PostConstruct
    public void init() {
        System.out.println("Initialization");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying");
    }
}
