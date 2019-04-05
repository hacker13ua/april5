package org.esurovskiy;

import java.util.HashSet;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class SetCorrupted {
    public static void main(String[] args) {
        final Car redCar = new Car("RED", 200);
        final Car greenCar = new Car("GREEN", 200);
        final HashSet<Car> cars = new HashSet<>();
        cars.add(redCar);
        cars.add(greenCar);
        redCar.setRed("GREEN");

        final Car redCar2 = new Car("RED", 200);

        System.out.println(cars.size());
        System.out.println(cars.contains(redCar));
        System.out.println(cars.contains(greenCar));

    }
}
