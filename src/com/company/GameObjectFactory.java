package com.company;

/**
 * Created by ajax0xd9 on 1/31/16.
 */
public class GameObjectFactory {

    public GameObject makeObject(String objectType, int num){

        GameObject newObject = null;
        if(objectType.equalsIgnoreCase("B")){
            return newObject = new BlackWhole();
        }
        if (objectType.equalsIgnoreCase("T")) {
            return newObject = new Trap();
        }
        if(objectType.equalsIgnoreCase("H")) {
            return newObject = new HealthPack();
        }
        else {
            return null;
        }
    }



}
