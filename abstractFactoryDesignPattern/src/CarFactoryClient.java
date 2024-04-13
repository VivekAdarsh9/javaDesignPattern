import factory.CarFactory;
import factory.EuropeCarFactory;
import factory.NorthAmericaCarFactory;
import product.Car;
import product.CarSpecification;
import product.NorthAmericaCarSpecification;
import product.Sedan;

public class CarFactoryClient {
    public static void main(String[] args) {

        CarFactory northAmericaFactory=new NorthAmericaCarFactory();
        Car northamericaCar=northAmericaFactory.createCar();
        CarSpecification northAmericaSpecification=northAmericaFactory.createCarSpecification();

        northamericaCar.assemble();
        northAmericaSpecification.display();


        CarFactory europeCarFactory=new EuropeCarFactory();
        Car europeCar=europeCarFactory.createCar();
        CarSpecification europeCarFactoryCarSpecification=europeCarFactory.createCarSpecification();
        europeCar.assemble();
        europeCarFactoryCarSpecification.display();



    }
}