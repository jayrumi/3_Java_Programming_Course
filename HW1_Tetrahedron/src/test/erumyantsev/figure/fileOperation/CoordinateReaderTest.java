package test.erumyantsev.figure.fileOperation;

import org.erumyantsev.figure.fileOperation.CoordinateReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Yauheni_Rumiantsau on 6/30/2017.
 */
public class CoordinateReaderTest {

    @Test
    public void testCoordinateReader(){

        CoordinateReader testReader = new CoordinateReader();
        List<String> testCoordinates = testReader.readFromFile("src\\coordinates.txt");
        System.out.println(testCoordinates);
        // need to add Assert
        //Assert. (testCoordinates);
    }
}
