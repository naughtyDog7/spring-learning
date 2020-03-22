package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Music classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        Music rapMusic = context.getBean("rapMusic", RapMusic.class);
//        Music rockMusic = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(classicalMusic1.getSong());
//        System.out.println(rapMusic.getSong());
//        System.out.println(rockMusic.getSong());
//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();
        Computer computer1 = context.getBean("computer", Computer.class);
        System.out.println(computer1);
        context.close();
    }
}
