package org.rumyantsev.gameroom.toy;

import org.rumyantsev.gameroom.type.AgeGroup;
import org.rumyantsev.gameroom.type.ToyMatherial;
import org.rumyantsev.gameroom.type.ToySize;

/**
 * Created by Yauheni_Rumiantsau on 7/16/2017.
 */
public class Cube extends Toy {

    private int cubeQuantity;
    private String cubeColor;
    private boolean withLetter;

    public Cube(ToySize toySize, ToyMatherial toyMatherial, float price, AgeGroup ageGroup, int cubeQuantity, String cubeColor, boolean withLetter) {
        super(toySize, toyMatherial, price, ageGroup);
        this.cubeQuantity = cubeQuantity;
        this.cubeColor = cubeColor;
        this.withLetter = withLetter;
    }

    public int getCubeQuantity() {
        return cubeQuantity;
    }

    public void setCubeQuantity(int cubeQuantity) {
        this.cubeQuantity = cubeQuantity;
    }

    public String getCubeColor() {
        return cubeColor;
    }

    public void setCubeColor(String cubeColor) {
        this.cubeColor = cubeColor;
    }

    public boolean isWithLetter() {
        return withLetter;
    }

    public void setWithLetter(boolean withLetter) {
        this.withLetter = withLetter;
    }
}
