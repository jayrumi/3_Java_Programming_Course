package org.erumyantsev.legohouse;

/**
 * Created by Yauheni_Rumiantsau on 7/9/2017.
 */
public enum Bricks {

    ROOF(5), FLOOR(3), WALL_INNER(1), WALL_OUTER(3), MIDFLOOR(3), DOOR(1), WINDOW(0.5), STAIRWAYS(3);

    private double brick;

    Bricks(double brick) {
        this.brick = brick;
    }

    public double getBrick() {
        return brick;
    }
}
