package org.erumyantsev.legohouse;

import java.util.ArrayList;

import static org.erumyantsev.legohouse.Bricks.FLOOR;
import static org.erumyantsev.legohouse.Bricks.ROOF;
import static org.erumyantsev.legohouse.Bricks.WALL_INNER;

/**
 * Created by Yauheni_Rumiantsau on 7/9/2017.
 */
public class PrintInvoice {

    public static void main(String[] args){

        /*House house = new House();

        String printHouseInfo1 = house.houseInfo(6, 5678, "Dacha", 1);
        String printHouseInfo2 = house.houseInfo(687, 6876, "Neverland", 1);
        String printHouseInfo3 = house.houseInfo(5, 9978, "dom", 4);

        System.out.println(printHouseInfo1);
        System.out.println(printHouseInfo2);
        System.out.println(printHouseInfo3);*/
        House house1 = new House(5, 9978, "dom", 4);
        String printHouseInfo1 = house1.houseInfo();
        System.out.println(printHouseInfo1);

        //ArrayList<Bricks> bricksList = new ArrayList<>();
        house1.newPart(ROOF, 10);
        house1.newPart(FLOOR, 5);
        house1.newPart(WALL_INNER, 2);

        house1.printCheck();

    }

}
