package org.erumyantsev.legohouse;

/**
 * Created by Yauheni_Rumiantsau on 7/9/2017.
 */
public enum Bricks {

    ROOF(5, "Roof"), FLOOR(3, "Floor"), WALL_INNER(1, "Wall inner"), WALL_OUTER(3, "Wall outer"), MIDFLOOR(3, "Midfloor"), DOOR(1, "Door"), WINDOW(0.5f, "Window"), STAIRWAYS(3, "Stairways");

    private float price;
    private String brickName;

    Bricks(float price, String brickName) {
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
