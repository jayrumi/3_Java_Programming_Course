package org.rumyantsev.gameroom.type;

/**
 * Created by Yauheni_Rumiantsau on 7/16/2017.
 */
public enum AgeGroup {
    BABY("0-12 months"), TODDLER("1-3 years"), PRESCHOOL("3-5 years"), GRADESCHOOLER("5-12 years");

    private String description;

    AgeGroup(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
