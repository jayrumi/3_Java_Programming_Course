package org.erumyantsev.figure.fileOperation;

import org.erumyantsev.figure.entity.Point;
import org.erumyantsev.figure.entity.Tetrahedron;

import java.util.List;

/**
 * Created by Yauheni_Rumiantsau on 6/21/2017.
 */
public class TetrahedronCreator {

    public static Tetrahedron tetrahedronCreator(){

        CoordinateParser coordinateParser = new CoordinateParser();
        List<Point> pointList = coordinateParser.parseCoordinate();

        return new Tetrahedron(
                pointList.get(0),
                pointList.get(1),
                pointList.get(2),
                pointList.get(3));
    }

}
