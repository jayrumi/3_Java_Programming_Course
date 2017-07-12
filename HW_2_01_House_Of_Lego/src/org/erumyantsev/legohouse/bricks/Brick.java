package org.erumyantsev.legohouse.bricks;

/**
 * Created by Yauheni_Rumiantsau on 7/11/2017.
 */
public enum Brick {

    ROOF(5, "Roof"), FLOOR(3, "Floor"), WALL_IN(1, "Wall inner"), WALL_OUT(3, "Wall outer"), MIDFLOOR(3, "Midfloor"), DOOR(1, "Door"), WINDOW(0.5f, "Window"), STRWAYS(3, "Stairways");

    private float price;
    private String brickName;

    Brick(float price, String brickName) {
        this.price = price;
        this.brickName = brickName;
    }

    public float getPrice() {
        return price;
    }

    public String getBrickName() {
        return brickName;
    }
}

