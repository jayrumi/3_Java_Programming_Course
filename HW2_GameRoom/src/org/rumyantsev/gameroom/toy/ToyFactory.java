package org.rumyantsev.gameroom.toy;

import org.rumyantsev.gameroom.exception.ToyException;
import org.rumyantsev.gameroom.type.*;

/**
 * Created by jayrumi on 7/28/2017.
 */
public class ToyFactory {

    public Toy createToy(String[] toyDescription) throws ToyException {

        ToyType toyType = ToyType.valueOf(toyDescription[0]);
        ToySize toySize = ToySize.valueOf(toyDescription[1]);
        ToyMatherial toyMatherial = ToyMatherial.valueOf(toyDescription[2]);
        AgeGroup ageGroup = AgeGroup.valueOf(toyDescription[3]);
        try {
            switch (toyType.name().toUpperCase()) {
                case "BALL":
                    BallType ballType = BallType.valueOf(toyDescription[6]);
                    return new Ball(toySize, toyMatherial, Float.parseFloat(toyDescription[4]), ageGroup, Float.parseFloat(toyDescription[5]), ballType);
                case "CAR":
                    return new Car(toySize, toyMatherial, Float.parseFloat(toyDescription[4]), ageGroup, Integer.parseInt(toyDescription[5]));
                case "CUBE":
                    return new Cube(toySize, toyMatherial, Float.parseFloat(toyDescription[4]), ageGroup, Integer.parseInt(toyDescription[5]), toyDescription[6], Boolean.parseBoolean(toyDescription[7]));
                case "DOLL":
                    return new Doll(toySize, toyMatherial, Float.parseFloat(toyDescription[4]), ageGroup, Boolean.parseBoolean(toyDescription[5]));
            }
        } catch(IllegalArgumentException e){
            throw new ToyException("Wrong toy type");
        }

    }

}
