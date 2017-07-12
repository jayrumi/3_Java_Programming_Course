package org.erumyantsev.legohouse.main;

import org.erumyantsev.legohouse.house.House;

/**
 * Created by Yauheni_Rumiantsau on 7/12/2017.
 */
public class MainExercise2 {

    public static void main(String[] args) {

        House house = new House(10000, 2, "EmpireStateBuilding", 2);
        System.out.printf("[%d: %d : %s : %d ]", house.getCollectorNumber(), house.getHouseNumber(), house.getHouseName(), house.getHouseQuantity());

    }
}
