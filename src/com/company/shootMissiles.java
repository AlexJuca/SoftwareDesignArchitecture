package com.company;

/**
 * Created by ajax0xd9 on 1/31/16
 * Using a strategy pattern here to add code to object using composition
 * That way we don't have duplicate code.
 */
public interface shootMissiles {
    public void shoot();

    public void shoot(Player player);
}

class CanShoot implements shootMissiles {
    @Override
    public void shoot(Player player) {
        player.setHealth(player.getHealth() - 60);
    }

    @Override
    public void shoot() {

    }
}

class CanNotShoot implements shootMissiles {
    @Override
    public void shoot() {

    }

    @Override
    public void shoot(Player player) {

    }
}
