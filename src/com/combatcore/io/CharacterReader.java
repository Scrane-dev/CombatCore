package com.combatcore.io;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CharacterReader {
    public return getCharacter() {
        try {
            new FileInputStream("data/hero.properties");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}