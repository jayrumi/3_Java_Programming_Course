package org.rumyantsev.gameroom.type;

/**
 * Created by jayrumi on 7/28/2017.
 */
public enum BallType {

    FOOTBALL("Football"), VOLLEYBALL("Volleyball"), BASKETBALL("Basketball"), SIMPLEBALL("Simple ball");

    private String description;

    BallType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
