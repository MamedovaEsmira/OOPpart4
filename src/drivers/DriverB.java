package drivers;

import carRase.PassengerCars;

public class DriverB<B extends PassengerCars> extends Drivers {

    public DriverB(String fullname, String driversLicense, int experience) {
        super(fullname, driversLicense, experience);
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
    public void driverB(B PassengerCars) {
        System.out.printf("Водитель %s, управляет легковым автомобилем %s %s и будет участвовать в заезде.\n", getFullname(), PassengerCars.getBrand(), PassengerCars.getModel());
    }
}
