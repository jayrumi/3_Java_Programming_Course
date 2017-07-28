package org.rumyantsev.gameroom.toy;

import org.rumyantsev.gameroom.type.AgeGroup;
import org.rumyantsev.gameroom.type.ToyMatherial;
import org.rumyantsev.gameroom.type.ToySize;

/**
 * Created by Yauheni_Rumiantsau on 7/16/2017.
 */
public class Car extends Toy {

    private int wheelCount;

    public Car(ToySize toySize, ToyMatherial toyMatherial, float price, AgeGroup ageGroup, int wheelCount) {
        super(toySize, toyMatherial, price, ageGroup);
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

}
