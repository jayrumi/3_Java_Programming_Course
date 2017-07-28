package org.rumyantsev.gameroom.toy;

import org.rumyantsev.gameroom.type.AgeGroup;
import org.rumyantsev.gameroom.type.ToyMatherial;
import org.rumyantsev.gameroom.type.ToySize;

import java.util.Objects;

/**
 * Created by Yauheni_Rumiantsau on 7/16/2017.
 */
public abstract class Toy {

    public ToySize toySize;
    public ToyMatherial toyMatherial;
    public float price;
    public AgeGroup ageGroup;

    public Toy(ToySize toySize, ToyMatherial toyMatherial, float price, AgeGroup ageGroup) {
        this.toySize = toySize;
        this.toyMatherial = toyMatherial;
        this.price = price;
        this.ageGroup = ageGroup;
    }

    public ToySize getToySize() {
        return toySize;
    }

    public void setToySize(ToySize toySize) {
        this.toySize = toySize;
    }

    public ToyMatherial getToyMatherial() {
        return toyMatherial;
    }

    public void setToyMatherial(ToyMatherial toyMatherial) {
        this.toyMatherial = toyMatherial;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (Float.compare(toy.price, price) != 0) return false;
        if (toySize != toy.toySize) return false;
        if (toyMatherial != toy.toyMatherial) return false;
        return ageGroup == toy.ageGroup;
    }

    @Override
    public int hashCode() {
        int result = toySize.hashCode();
        result = 31 * result + toyMatherial.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + ageGroup.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toySize=" + toySize +
                ", toyMatherial=" + toyMatherial +
                ", price=" + price +
                ", ageGroup=" + ageGroup +
                '}';
    }
}
