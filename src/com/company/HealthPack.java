package com.company;

/**
 * Created by ajax0xd9 on 1/31/16.
 * This is a class for a health pack that increases a players life by N points
 * The health pack is activated when a player and object are objected in
 * the same position in the game terrain.
 */
public class HealthPack extends GameObject {

    public HealthPack(){

    }

    public void increasePlayerHealth(Player player){
        player.setHealth(+20);
    }

}
