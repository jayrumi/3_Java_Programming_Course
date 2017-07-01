package org.erumyantsev.figure.fileOperation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.erumyantsev.figure.entity.Point;
import org.erumyantsev.figure.exception.WrongDelimiterException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yauheni_Rumiantsau on 6/21/2017.
 */
public class CoordinateParser {

    private static final Logger LOG = LogManager.getLogger();
    final static String DELIMITER = ";";

    public static List<Point> parseCoordinate(String fileName) throws WrongDelimiterException {

        CoordinateReader fromFile = new CoordinateReader();
        List<String> listOfCoordinates = fromFile.readFromFile(fileName);
        List<Point> pointList = new ArrayList<>();

        for (int i=0; i<listOfCoordinates.size(); i++) {// While?
            String items = listOfCoordinates.get(i);

            int countDelimiters = 0;
            Pattern p = Pattern.compile(DELIMITER);
            Matcher m = p.matcher(items);
            while (m.find()) countDelimiters++;
            if (countDelimiters < 2 || countDelimiters > 2){
                throw new WrongDelimiterException("Wrong delimiter detected. Please check file");
            }

            String[] itemCoordinate = items.split(DELIMITER);

            try {
                Point point = new Point(
                        Float.parseFloat(itemCoordinate[0]),
                        Float.parseFloat(itemCoordinate[1]),
                        Float.parseFloat(itemCoordinate[2]));
                pointList.add(point);
            } catch(ArrayIndexOutOfBoundsException e){
                LOG.error("ERROR. Several coordinates are missing. " + e);
            } catch (NumberFormatException e){
                LOG.error("ERROR. Wrong number. " + e);
            } // finaly???
        }

        return pointList;
    }
}
