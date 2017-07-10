package org.erumyantsev.legohouse;

import java.util.*;

/**
 * Created by Yauheni_Rumiantsau on 7/5/2017.
 */
public class House {

    private String houseName;
    private int houseNumber;
    private int collectorNumber;
    private int houseQuantity;
    private ArrayList<Bricks> bricksList = new ArrayList<>();
    Bricks enumBricks;

    public House(int collectorNumber, int houseNumber, String houseName, int houseQuantity){
        this.collectorNumber = collectorNumber;
        this.houseNumber = houseNumber;
        this.setHouseName(houseName);
        this.houseQuantity = houseQuantity;
    }

    public String houseInfo(/*int collectorNumber, int houseNumber, String houseName, int houseQuantity*/){
        String printHouseInfo = String.format("[%d: %d : %s :%d]", collectorNumber, houseNumber, houseName, houseQuantity);
        //String printHouseInfo = "["+collectorNumber+": "+houseNumber+" : "+houseName+" :"+houseQuantity+"]";
        return printHouseInfo;
    }

    public void newPart(Bricks legoBrick, int brickQuantity){
        for(int i = 0; i < brickQuantity; i++){
            bricksList.add(legoBrick);
            //System.out.println(bricksList);
        }
        Collections.sort(bricksList, new Comparator<Bricks>() {// Isn't work!
            @Override
            public int compare(Bricks o1, Bricks o2) {
                return o1.compareTo(o2);
            }
        });
        //System.out.println(bricksList);
    }

    public void printCheck(){
        Bricks prevBrick = null;
        int brickCounter = 0;
        int brickAmount;
        int endAmount;

        System.out.println("===================================");
        System.out.printf("Коллекционер: %d", collectorNumber);
        System.out.printf("\nНазвание: %s", houseName);
        System.out.println("\n-----------------------------------");

        for (int i = 0; i < bricksList.size(); i++){
            if (prevBrick == null){
                prevBrick = bricksList.get(i);
            }

            if (prevBrick != bricksList.get(i) || i == bricksList.size()-1){
                //System.out.printf(prevBrick+"   %d   %d$\n", brickCounter, prevBrick.values());
                System.out.printf(prevBrick+"   "+brickCounter+"   "+prevBrick.values()+"\n");
                brickCounter = 0;
                prevBrick = bricksList.get(i);
            }

            brickCounter += 1;
        }

        System.out.println("===================================");
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        if (houseName.length()<4 || houseName.length()>20){
            this.houseName = "House#" + this.collectorNumber;
        }
        else{
            this.houseName = houseName;
        }
    }

    public int getCollectorNumber() {
        return collectorNumber;
    }

    public void setCollectorNumber(int collectorNumber) {
        this.collectorNumber = collectorNumber;
    }

    public int getHouseQuantity() {
        return houseQuantity;
    }

    public void setHouseQuantity(int houseQuantity) {
        this.houseQuantity = houseQuantity;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
