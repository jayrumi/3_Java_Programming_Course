package org.erumyantsev.legohouse.main;

import org.erumyantsev.legohouse.house.House;
import org.erumyantsev.legohouse.print.PrintInvoice;

import static org.erumyantsev.legohouse.bricks.Brick.*;

/**
 * Created by Yauheni_Rumiantsau on 7/11/2017.
 */
public class MainExercise5 {

    public static void main(String[] args){

        PrintInvoice printer = new PrintInvoice();
        House h1 = new House(6, 5678, "Dacha", 2);
        House h2 = new House(687, 6876, "Dom", 1);

        h1.newPart(WALL_OUT, 4);
        h1.newPart(FLOOR, 1);
        h1.newPart(ROOF, 1);
        h1.newPart(WINDOW, 2);
        h1.newPart(DOOR, 1);
        h1.newPart(STRWAYS, 1);
        printer.printCheck(h1);

        h2.newPart(WALL_OUT, 48);
        h2.newPart(WALL_IN, 32);
        h2.newPart(WINDOW, 44);
        h2.newPart(DOOR, 75);
        h2.newPart(ROOF, 1);
        h2.newPart(FLOOR, 1);
        h2.newPart(STRWAYS, 1);
        printer.printCheck(h2);

    }

}