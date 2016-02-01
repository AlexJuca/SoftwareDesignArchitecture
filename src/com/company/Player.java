package com.company;

import java.util.Random;

/**
 * Created by ajax0xd9 on 1/31/16.
 */
public class Player extends GameObject {
    private int legs = 2;
    private int arms = 2;
    private int speed = 2;           // Player can only perform two steps in a particular direction
    private int strength = 100;
    private int health = 100;
    private int shield = 0;
    private String name = Player.class.getSimpleName();


    /**
     * This inner class holds the "radius" data for possible moving positions for the player.
     * The player can never move diagonally, only vertically and horizontally.
     **/


    public int getStrength() {
        return strength;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public int getLegs() {
        return legs;
    }


    public int getArms() {
        return arms;
    }


    public void moveForward(){

    }

    public void moveBack() {

    }

    public void moveLeft() {

    }

    public void moveRight() {

    }

    @Override
    public ObjectRadius setPlayerRadius(int mapLength, int playerPosition) {
        return super.setPlayerRadius(mapLength, playerPosition);
    }
}
