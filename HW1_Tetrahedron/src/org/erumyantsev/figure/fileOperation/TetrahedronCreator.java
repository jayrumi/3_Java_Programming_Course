package org.erumyantsev.figure.fileOperation;

import org.erumyantsev.figure.entity.Point;
import org.erumyantsev.figure.entity.Tetrahedron;
import org.erumyantsev.figure.exception.WrongDelimiterException;

import java.util.List;

/**
 * Created by Yauheni_Rumiantsau on 6/21/2017.
 */
public class TetrahedronCreator {

    public static Tetrahedron tetrahedronCreator(String fileName) throws WrongDelimiterException {

        CoordinateParser coordinateParser = new CoordinateParser();
        List<Point> pointList = coordinateParser.parseCoordinate(fileName);

        return new Tetrahedron(
                pointList.get(0),
                pointList.get(1),
                pointList.get(2),
                pointList.get(3));
    }

}
