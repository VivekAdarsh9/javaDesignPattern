package factory;

import product.Car;
import product.CarSpecification;

public interface CarFactory {
    Car createCar();
    CarSpecification createCarSpecification();
}
