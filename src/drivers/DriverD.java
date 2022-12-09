package drivers;
import carRase.Buses;
import carRase.Transport;
import category.Category;

public class DriverD<D extends Buses, T extends Transport, C extends Category> extends Drivers<C> {
    public DriverD(String fullname, String driversLicense, int experience, C category ) {
        super(fullname, driversLicense, experience, category);
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

    @Override
    public void addDrivers(Drivers<?> driver) {

    }

    public void driverD(D Buses) {
        System.out.printf("Водитель %s, управляет автобусом %s %s и будет участвовать в заезде.\n", getFullname(), Buses.getBrand(), Buses.getModel());
    }
}
