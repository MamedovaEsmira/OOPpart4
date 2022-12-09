package drivers;

import carRase.PassengerCars;
import carRase.Transport;
import category.Category;

public class DriverB<B extends PassengerCars, T extends Transport, C extends Category> extends Drivers<C> {

    public DriverB(String fullname, String driversLicense, int experience, C category) {
        super(fullname, driversLicense, experience,category);
    }

    @Override
    public void startMoving() {
        System.out.printf("Водитель легкового автомобиля %s начал движение \n",getFullname());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Водитель легкового автомобиля %s остановился \n",getFullname());
    }

    @Override
    public void refuelTheCar() {
        System.out.printf("Водитель легкового автомобиля %s заправляет авто \n",getFullname());
    }

    @Override
    public void addDrivers(Drivers<?> driver) {

    }

    public void driverB(B PassengerCars) {
        System.out.printf("Водитель %s, управляет легковым автомобилем %s %s и будет участвовать в заезде.\n", getFullname(), PassengerCars.getBrand(), PassengerCars.getModel());
    }
}
