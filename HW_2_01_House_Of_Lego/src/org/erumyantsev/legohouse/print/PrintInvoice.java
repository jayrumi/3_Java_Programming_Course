package org.erumyantsev.legohouse.print;

import org.erumyantsev.legohouse.bricks.Brick;
import org.erumyantsev.legohouse.house.House;

import java.util.Map;

/**
 * Created by Yauheni_Rumiantsau on 7/12/2017.
 */
public class PrintInvoice {

    public void printCheck(House house){
        float price = 0f;
        int len = 0;

        System.out.println("===================================");
        System.out.printf("Коллекционер: %d", house.getCollectorNumber());
        System.out.printf("\nНазвание: %s", house.getHouseName());
        System.out.println("\n-----------------------------------");
        for (Map.Entry<Brick, Integer> brickMap: house.getBrickMap().entrySet()){
            Brick brickName = brickMap.getKey();
            price += brickName.getPrice()*brickMap.getValue();
            System.out.printf("%-16s %3d %10.1f$\n", brickName.getBrickName(), brickMap.getValue(), brickName.getPrice());
        }
        System.out.println("-----------------------------------");
        System.out.printf("Всего: %25.1f$\n", price);
        System.out.printf("Количество: %17d", house.getHouseQuantity());
        System.out.println("\n-----------------------------------");
        System.out.printf("Общая стоимость: %15.1f$\n", price*house.getHouseQuantity());
        System.out.println("===================================");
    }

}
