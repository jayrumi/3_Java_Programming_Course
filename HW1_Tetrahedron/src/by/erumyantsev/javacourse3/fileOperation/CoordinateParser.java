package by.erumyantsev.javacourse3.fileOperation;

import by.erumyantsev.javacourse3.entity.Point;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Yauheni_Rumiantsau on 6/21/2017.
 */
public class CoordinateParser {

    public static List<Point> splitCoordinate(){

        CoordinateReader fromFile = new CoordinateReader();
        List<String> listOfCoordinates = fromFile.readFromFile("src\\coordinates.txt");
        List<Point> pointList = null;

        for (int i=0; i<listOfCoordinates.size(); i++) {
            String items = listOfCoordinates.get(i);
            String[] itemCoordinate = items.split(" ");
            Point point = new Point(
                    Float.parseFloat(itemCoordinate[0]),
                    Float.parseFloat(itemCoordinate[1]),
                    Float.parseFloat(itemCoordinate[0]));

            pointList.add(point);
        }

        return pointList;
    }
}
