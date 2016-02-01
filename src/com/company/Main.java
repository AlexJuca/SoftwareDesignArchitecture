package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    /**
     * This is a simple command line game that demosntrates the use of Good software design/architecure principles,
     * as well as Design Patterns like Factory,Composition and Strategy.
     * The game creates a map in which the player can move through vertically or horizontally one step at a time via a radius
     * or coordinates. The player is limited to moving in any one of four directions until he finds the space treasure. Along the way the player may land
     * on traps and have his health deducted from. Healthpacks are available. 
     */

    public static void main(String[] args) {
	// write your code here
        Terrain t = Terrain.getInstance();
        T1000 alex = new T1000();
        Constructor constructor = new Constructor(alex, t); // Construct game map and instantiate a player onto it.
        // Use a factory to instantiate the games static objects

        GameObjectFactory factory = new GameObjectFactory();
        GameObject blackwhole = factory.makeObject("B", 2);
        GameObject traps = factory.makeObject("T", 1);
        GameObject healthpacks = factory.makeObject("H", 1);

        // TODO: Maybe we can have the factory return an ArrayList of game objects that will be instantiated on the map so we don't have to
        // this here.
        ArrayList<GameObject> gameObjects = new ArrayList<>(100);
        gameObjects.add(blackwhole);
        gameObjects.add(healthpacks);
        gameObjects.add(traps);
        for(GameObject obj : gameObjects) {
            obj.setObjectLocation(constructor.generateSpawnLocation());
        }
        Scanner input = new Scanner(System.in);
        int option = 0;


        while(input.hasNextInt()){ // Main Game Loop
            System.out.println("Make a move: ");
            option = input.nextInt(); // choose a position to move to based on what is in the players radius
            alex.setObjectLocation(option); // Change player location to the new location
            System.out.println("Current player location :" + alex.getObjectLocation());
            GameObject.ObjectRadius radius = alex.getPlayerRadius(t.getMapLength(), alex.getObjectLocation()); // The players current radius
            if(traps != null && traps.getObjectLocation() == alex.getObjectLocation()) {
                traps = (Trap) traps;
                ((Trap) traps).decreasePlayerHealth(alex);
                alex.setObjectLocation(radius.east);
                traps = null;
            }
            if ((alex.getObjectLocation() < 0) || (alex.getObjectLocation() > t.getMapSize()) ) {
                alex.setHealth(alex.getHealth() - 100);
                System.out.println("You fell of the game map and died!");
            }
            if (alex.getHealth() == 0) {
                System.out.println("You are dead!");
                System.exit(0);
            }
            if(option == -111) System.exit(0);
        }
    }
}
