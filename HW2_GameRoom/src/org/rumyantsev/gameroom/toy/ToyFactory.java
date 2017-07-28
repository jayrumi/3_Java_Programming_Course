package org.rumyantsev.gameroom.toy;

import org.rumyantsev.gameroom.type.ToySize;
import org.rumyantsev.gameroom.type.ToyType;

/**
 * Created by jayrumi on 7/28/2017.
 */
public class ToyFactory {

    public Toy createToy(String[] toyDescription){

        ToyType toyType = ToyType.valueOf(toyDescription[0]);

        switch (toyType.name().toUpperCase()){
            case "BALL":
                return new Ball((ToySize).valueOf(toyDescription[1]), toyDescription[2], Float.parseFloat(toyDescription[3]), toyDescription[4], toyDescription[5], toyDescription[6]);
        }

    }

}
