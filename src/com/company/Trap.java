package com.company;

/**
 * Created by ajax0xd9 on 1/31/16.
 */
public class Trap extends GameObject {

    public Trap(){

    }

    public void decreasePlayerHealth(Player player){
        player.setHealth(player.getHealth() - 20);
        System.out.println("You are in a trap. Health is now " + player.getHealth());
    }
}
