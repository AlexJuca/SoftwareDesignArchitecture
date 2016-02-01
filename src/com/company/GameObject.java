package com.company;

import java.util.Random;

/**
 * Created by ajax0xd9 on 1/31/16.
 */
public abstract class GameObject {
    private int objectLocation = 0;
    private int objectDirection = 0; // The current direction the player is facing 0 means that no direction was set
    private int speed = 2;
    private String name = GameObject.class.getSimpleName();
    private shootMissiles shootMissilesBehaviour;

    class ObjectRadius {
        int north;
        int south;
        int east;
        int west;
        boolean radiusWasSet = false;
    }

    public int getObjectLocation() {
        return objectLocation;
    }

    public void setObjectLocation(int objectLocation) {
        this.objectLocation = objectLocation;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ObjectRadius getPlayerRadius(int mapLength, int playerPosition) {
        ObjectRadius radius = new ObjectRadius();
        radius.north = playerPosition - mapLength;
        radius.east = playerPosition - 1;
        radius.west = playerPosition + 1;
        radius.south = playerPosition + mapLength;
        System.out.println("Player Radius : North => " + radius.north +
                " South => " + radius.south +
                " East =>  " + radius.east +
                " West => " + radius.west);
        radius.radiusWasSet = true;
        return  radius;
    }

    /**
     *
     * @param mapLength Terrain Width
     * @param playerPosition The player's current position on the game terrain
     * @return a radius object describing the possible location changes for a player on the terrain
     */
    public ObjectRadius setPlayerRadius(int mapLength, int playerPosition) {
        ObjectRadius radius = new ObjectRadius();
        radius.north = playerPosition - mapLength;
        radius.east = playerPosition - 1;
        radius.west = playerPosition + 1;
        radius.south = playerPosition + mapLength;
        System.out.println("Player Radius : North => " + radius.north +
                " South => " + radius.south +
                " East =>  " + radius.east +
                " West => " + radius.west);
        radius.radiusWasSet = true;
        return radius;
    }

    /**
     * Randomly choose a direction for a game object to face when it is spawned on the game terrain.
     * @param radius
     */
    public void setObjectDirection(ObjectRadius radius) {
        Random random = new Random();
        int direction[] = {radius.north, radius.south, radius.east, radius.west};
        // TODO: Check if the player is facing a wall
        objectDirection = direction[random.nextInt(direction.length)];
        System.out.println(name + " direction is: " + objectDirection);

    }

    public shootMissiles getShootMissilesBehaviour() {
        return shootMissilesBehaviour;
    }

    public void setShootMissilesBehaviour(shootMissiles shootMissilesBehaviour) {
        this.shootMissilesBehaviour = shootMissilesBehaviour;
    }
}
