package org.rumyantsev.gameroom.toy;

import org.rumyantsev.gameroom.type.AgeGroup;
import org.rumyantsev.gameroom.type.ToyMatherial;
import org.rumyantsev.gameroom.type.ToySize;

/**
 * Created by Yauheni_Rumiantsau on 7/16/2017.
 */
public class Doll extends Toy {

    private boolean isBarby;

    public Doll(ToySize toySize, ToyMatherial toyMatherial, float price, AgeGroup ageGroup, boolean isBarby) {
        super(toySize, toyMatherial, price, ageGroup);
        this.isBarby = isBarby;
    }

    public boolean isBarby() {
        return isBarby;
    }

    public void setBarby(boolean barby) {
        isBarby = barby;
    }
}
