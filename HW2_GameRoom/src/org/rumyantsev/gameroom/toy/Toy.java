package org.rumyantsev.gameroom.toy;

import org.rumyantsev.gameroom.type.ToyMatherial;
import org.rumyantsev.gameroom.type.ToySize;

import java.util.Objects;

/**
 * Created by Yauheni_Rumiantsau on 7/16/2017.
 */
public class Toy {

    public ToySize toySize;
    public ToyMatherial toyMatherial;
    public float price;

    public Toy(ToySize toySize, ToyMatherial toyMatherial, float price) {
        this.toySize = toySize;
        this.toyMatherial = toyMatherial;
        this.price = price;
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

    @Override
    public String toString() {
        return "Toy{" +
                "toySize=" + toySize +
                ", toyMatherial=" + toyMatherial +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Float.compare(toy.price, price) == 0 &&
                toySize == toy.toySize &&
                toyMatherial == toy.toyMatherial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toySize, toyMatherial, price);
    }
}
