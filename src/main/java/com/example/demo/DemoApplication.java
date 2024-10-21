package com.example.demo;

import com.example.demo.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        MarioGame marioGame = new MarioGame();
//        SuperContraGame superContraGame = new SuperContraGame();
//        PacmanGame pacmanGame = new PacmanGame();
//        GamingConsole gamingConsole = new MarioGame();
//        GameRunner gameRunner = new GameRunner(gamingConsole);
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();
    }
}
