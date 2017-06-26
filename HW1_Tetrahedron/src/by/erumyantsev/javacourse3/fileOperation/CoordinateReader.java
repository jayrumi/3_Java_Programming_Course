package by.erumyantsev.javacourse3.fileOperation;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Yauheni_Rumiantsau on 6/21/2017.
 */
public class CoordinateReader {

    public static List<String> readFromFile(String fileName){

        List<String> coordinatesFromFile =null;

        try {
             coordinatesFromFile = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

        } catch (NoSuchFileException e) {
            System.out.println("Catched error: " + e);// log error
        } /*catch(NumberFormatException | NullPointerException exc) {
            System.out.println(exc);
        }*/ catch (IOException e) {
            e.printStackTrace();
        }
        return coordinatesFromFile;
    }

}
