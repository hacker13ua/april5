package org.esurovskiy;

import java.util.Objects;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Car {
    private  String red;
    private int speed;

    public Car(final String red, final int speed) {
        this.red = red;
        this.speed = speed;
    }

    public void setRed(final String red) {
        this.red = red;
    }

    @Override
    public String toString() {
        return "Car{" +
                "red='" + red + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Car car = (Car) o;
        return speed == car.speed &&
                Objects.equals(red, car.red);
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, speed);
    }
}
