package org.erumyantsev.legohouse.house;

import org.erumyantsev.legohouse.bricks.Brick;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by Yauheni_Rumiantsau on 7/12/2017.
 */
public class House {

    private String houseName;
    private int houseNumber;
    private int collectorNumber;
    private int houseQuantity;
    private final static int COMPONENTS_NUMBER = 7;
    private int counter = 0;
    private HashMap<Brick, Integer> brickMap = new HashMap<>();

    public House(int collectorNumber, int houseNumber, String houseName, int houseQuantity){
        this.collectorNumber = collectorNumber;
        this.houseNumber = houseNumber;
        this.setHouseName(houseName);
        this.houseQuantity = houseQuantity;
    }

    public void newPart(Brick legoBrick, int brickQuantity){

        if (brickMap.size() < COMPONENTS_NUMBER){
            brickMap.put(legoBrick, brickQuantity);
            counter += 1;
        } else{
            System.out.printf("Домик %s уже построен. К нему больше нельзя добавить элемент.", houseName);
        }
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        if (houseName.length()<4 || houseName.length()>20){
            this.houseName = "Дом#" + this.collectorNumber;
        }
        else{
            this.houseName = houseName;
        }
    }

    public int getCollectorNumber() {
        return collectorNumber;
    }

    public int getHouseQuantity() {
        return houseQuantity;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public HashMap<Brick, Integer> getBrickMap() {
        return brickMap;
    }
}
