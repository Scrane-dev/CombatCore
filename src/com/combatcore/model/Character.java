package com.combatcore.model;

public class Character{
    private String name;
    private int maxHp;
    private int currentHp;
    private int attack;
    private int defense;
    private String[] actions;
    
    public Character(String name, int maxHp, int attack, int defense, String[] actions) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack= attack;
        this.defense = defense;
        this.actions = actions;
    }
}

