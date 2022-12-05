package drivers;
import carRase.Trucks;

public class DriverC<C extends Trucks> extends Drivers {
    public DriverC(String fullname, String driversLicense, int experience) {
        super(fullname, driversLicense, experience);
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
    public void driverC(C Trucks) {
        System.out.printf("Водитель %s, управляет грузовым автомобилем %s %s и будет участвовать в заезде.\n", getFullname(), Trucks.getBrand(), Trucks.getModel());
    }
}
