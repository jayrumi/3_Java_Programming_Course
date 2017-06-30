package org.erumyantsev.figure.fileOperation;

import org.erumyantsev.figure.entity.Point;

import java.util.*;

/**
 * Created by Yauheni_Rumiantsau on 6/21/2017.
 */
public class CoordinateParser {

    /*public static void main(String[] args){
        System.out.println("ff");
        parseCoordinate();
    }*/

    public static List<Point> parseCoordinate(){

        CoordinateReader fromFile = new CoordinateReader();
        List<String> listOfCoordinates = fromFile.readFromFile("src\\coordinates.txt");
        List<Point> pointList = new ArrayList<>();

        for (int i=0; i<listOfCoordinates.size(); i++) {
            String items = listOfCoordinates.get(i);
            String[] itemCoordinate = items.split(" ");
            Point point = new Point(
                    Float.parseFloat(itemCoordinate[0]),
                    Float.parseFloat(itemCoordinate[1]),
                    Float.parseFloat(itemCoordinate[2]));

            pointList.add(point);
        }

        return pointList;
    }
}
