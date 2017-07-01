package test.erumyantsev.figure.fileOperation;

import org.erumyantsev.figure.entity.Point;
import org.erumyantsev.figure.exception.WrongDelimiterException;
import org.erumyantsev.figure.fileOperation.CoordinateParser;
import org.junit.Test;

import java.util.List;

/**
 * Created by Yauheni_Rumiantsau on 7/1/2017.
 */
public class CoordinateParserTest {

    @Test
    public void testCoordinateParser() throws WrongDelimiterException {

        CoordinateParser testParser = new CoordinateParser();
        List<Point> testPointList = testParser.parseCoordinate("src\\coordinates.txt");
        System.out.print(testPointList);

    }

}
