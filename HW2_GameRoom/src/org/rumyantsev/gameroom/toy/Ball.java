package org.rumyantsev.gameroom.toy;

import org.rumyantsev.gameroom.type.AgeGroup;
import org.rumyantsev.gameroom.type.BallType;
import org.rumyantsev.gameroom.type.ToyMatherial;
import org.rumyantsev.gameroom.type.ToySize;

/**
 * Created by Yauheni_Rumiantsau on 7/16/2017.
 */
public class Ball extends Toy {

    private float ballVolume;
    private BallType ballType;

    public Ball(ToySize toySize, ToyMatherial toyMatherial, float price, AgeGroup ageGroup, float ballVolume, BallType ballType) {
        super(toySize, toyMatherial, price, ageGroup);
        this.ballVolume = ballVolume;
        this.ballType = ballType;
    }

    public float getBallVolume() {
        return ballVolume;
    }

    public void setBallVolume(float ballVolume) {
        this.ballVolume = ballVolume;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }
}
