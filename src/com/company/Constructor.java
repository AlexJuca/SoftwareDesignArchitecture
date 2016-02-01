package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ajax0xd9 on 1/31/16.
 * The constructor is delegated to spawn non static game objects into the map.
 **/
public class Constructor {
    Terrain terrain = null;
    Player player = null;

    public Constructor(Player p, Terrain t){
        player = p;
        terrain = t;
        while (player.getObjectLocation() == 0) {
            player.setObjectLocation(generateSpawnLocation());
        }

        Player.ObjectRadius objectRadius = player.setPlayerRadius(terrain.getMapLength(), player.getObjectLocation());
        if (objectRadius.radiusWasSet) {
            player.setObjectDirection(objectRadius);
        } else {
            player.setPlayerRadius(terrain.getMapLength(), player.getObjectLocation());
        }
    }

    /**
     * Generate a new player Location inside the terrain
     * @return  a location on the terrain
     */
    public int generateSpawnLocation(){
        System.out.println("Generating object location: ");
        Random r = new Random();
        int location = r.nextInt(terrain.getMapSize());
        System.out.println("object location:  " + location);
        assert location == 0;
        return location;
    }

}
