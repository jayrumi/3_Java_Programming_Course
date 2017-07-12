package org.erumyantsev.legohouse.main;

import org.erumyantsev.legohouse.house.House;

/**
 * Created by Yauheni_Rumiantsau on 7/12/2017.
 */
public class MainExercise3 {

    public static void main(String[] args){

        House h1 = new House(6, 5678, "Dacha", 1);
        House h2 = new House(687, 6876, "Neverland", 1);

        System.out.printf("Дом %d был создан коллекционером номер %d под названием «%s»\n", h1.getHouseNumber(), h1.getCollectorNumber(), h1.getHouseName());
        System.out.printf("Ещё один дом номер %d был собран коллекционером номер %d под названием «%s»\n", h2.getHouseNumber(), h2.getCollectorNumber(), h2.getHouseName());

    }
}
