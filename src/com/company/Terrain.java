package com.company;

/**
 * Created by ajax0xd9 on 1/31/16.
 * This class demonstrates the Singleton class
 * We use the singleton class because we only ever want one instance of a Terrain in the game.
 *
 */
public class Terrain {

    private static int mapLength = 10;
    private static int mapWidth = 10;
    private int mapSize = mapWidth * mapLength;

    private static Terrain instance = null;

    private Terrain(int mapLength, int mapWidth) {}

    // Will return only one instance of a N x N Grid where the player and game objects will be spawned
    public static Terrain getInstance() {
        if (instance == null) {
            instance = new Terrain(mapWidth, mapLength);
            System.out.println("Generated game terrain of size " + mapLength + " * " + mapWidth);
        }
        return instance;
    }

    public int getMapWidth() {
        return mapWidth;
    }

    public int getMapLength() {
        return mapLength;
    }

    public void setMapWidth(int mapWidth) {
        this.mapWidth = mapWidth;
    }


    public void setMapLength(int mapLength) {
        this.mapLength = mapLength;
    }

    public int getMapSize() {
        return mapSize;
    }
}
