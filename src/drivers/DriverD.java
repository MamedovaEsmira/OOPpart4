package drivers;

import carRase.Buses;
import carRase.PassengerCars;

public class DriverD<D extends Buses> extends Drivers {
    public DriverD(String fullname, boolean driversLicense, int experience) {
        super(fullname, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.printf("Водитель автобуса %s начал движение \n ",getFullname());

    }

    @Override
    public void stopMoving() {
        System.out.printf("Водитель автобуса %s остановился \n",getFullname());

    }

    @Override
    public void refuelTheCar() {
        System.out.printf("Водитель автобуса %s заправляет автобус \n",getFullname());

    }
    public void driverD(D Buses) {
        System.out.printf("Водитель %s, управляет автобусом %s %s и будет участвовать в заезде.\n", getFullname(), Buses.getBrand(), Buses.getModel());
    }
}
