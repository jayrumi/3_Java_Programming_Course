package org.erumyantsev.figure.fileOperation;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Yauheni_Rumiantsau on 6/21/2017.
 */
public class CoordinateReader {

    private static final Logger LOG = LogManager.getLogger();

    public static List<String> readFromFile(String fileName){

        List<String> coordinatesFromFile =null;

        LOG.info("Opening file " + fileName);

        try {

            coordinatesFromFile = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

        } catch (NoSuchFileException e) {

            LOG.error("NoSuchFileException " + e);

        } catch(NullPointerException e) {// not catch this exception

            LOG.error("NullPointerException " + e);

        } catch (IOException e) {

            LOG.error("Some problems with file reading. ");
            e.printStackTrace();

        }// finaly??? how to use?

        LOG.info("Reading from file has been completed successfully.");
        return coordinatesFromFile;
    }

}
