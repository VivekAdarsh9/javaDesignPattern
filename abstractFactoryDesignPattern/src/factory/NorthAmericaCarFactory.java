package factory;

import product.Car;
import product.CarSpecification;
import product.NorthAmericaCarSpecification;
import product.Sedan;

public class NorthAmericaCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new NorthAmericaCarSpecification();
    }
}
