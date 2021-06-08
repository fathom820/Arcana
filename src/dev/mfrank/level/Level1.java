package dev.mfrank.level;

import dev.mfrank.Main;

import dev.mfrank.paladin.io.Debug;
import dev.mfrank.paladin.io.Io;

public class Level1 extends Level {

    public Level1 () {
        super.setId(1);
        super.setName("LEVEL 1");
        super.setInfo(Io.wrap("Welcome to Level 1! This is the first level of the Dungeon, ", 1));
    }

    public void run () {
        Debug.tell("Begin level 1");
        Io.printDivider();
        Io.tellRaw(getName());
        Io.setIndent(1);
        Io.tellRaw(getInfo());

        // TODO: implement battle context and test out new enemy functionality
    }
}