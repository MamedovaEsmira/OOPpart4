package drivers;
import carRase.Transport;
import carRase.Trucks;
import category.Category;


public class DriverC<R extends Trucks, T extends Transport, C extends Category> extends Drivers<C> {
    public DriverC(String fullname, String driversLicense, int experience, C category) {
        super(fullname, driversLicense, experience, category);
    }
    @Override
    public void startMoving() {
        System.out.printf("Водитель грузового автомобиля %s начал движение \n",getFullname());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Водитель грузового автомобиля %s остановился \n",getFullname());
    }

    @Override
    public void refuelTheCar() {
        System.out.printf("Водитель грузового автомобиля %s заправляет авто \n",getFullname());
    }

    @Override
    public void addDrivers(Drivers<?> driver) {

    }

    public void driverC(R Trucks) {
        System.out.printf("Водитель %s, управляет грузовым автомобилем %s %s и будет участвовать в заезде.\n", getFullname(), Trucks.getBrand(), Trucks.getModel());
    }
}
