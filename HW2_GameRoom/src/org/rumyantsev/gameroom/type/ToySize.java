package org.rumyantsev.gameroom.type;

/**
 * Created by Yauheni_Rumiantsau on 7/16/2017.
 */
public enum ToySize {
    S("Small"), M("Medium"), L("Large");

    private String description;

    ToySize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
