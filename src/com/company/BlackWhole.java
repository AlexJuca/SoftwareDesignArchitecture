package com.company;

/**
 * Created by ajax0xd9 on 1/31/16.
 */
public class BlackWhole extends GameObject {
    /**
     * A black whole is a game object that destroys a game when a player lands on it.
     *
     */

    @Override
    public int getObjectLocation() {
        return super.getObjectLocation();
    }

    @Override
    public void setObjectLocation(int objectLocation) {
        super.setObjectLocation(objectLocation);
    }

    @Override
    public void setObjectDirection(ObjectRadius radius) {
        super.setObjectDirection(radius);
    }

    @Override
    public ObjectRadius setPlayerRadius(int mapLength, int playerPosition) {
        return super.setPlayerRadius(mapLength, playerPosition);
    }

    @Override
    public ObjectRadius getPlayerRadius(int mapLength, int playerPosition) {
        return super.getPlayerRadius(mapLength, playerPosition);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

}
