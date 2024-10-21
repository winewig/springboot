package com.example.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole gamingConsole;

    @Autowired
    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public void run() {
        this.gamingConsole.up();
        this.gamingConsole.down();
        this.gamingConsole.left();
        this.gamingConsole.right();
        if (this.gamingConsole instanceof MarioGame) {
            ((MarioGame) this.gamingConsole).laugh();
        }
    }
}
