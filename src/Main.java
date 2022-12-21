import carRase.*;
import category.CategoryB;
import category.CategoryC;
import category.CategoryD;
import collections.Mechanic;
import collections.ServiceStation;
import collections.Sponsor;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;

import java.util.List;

public class Main {

    public static <D, R, C> void main(String[] args) {

        PassengerCars lexus = new PassengerCars("Lexus", "LX 570", 4.5f, BodyType.CROSSOVER);
        Mechanic<PassengerCars> ivan = new Mechanic<PassengerCars>("Иван", "Сергеев", "Рольф");
        lexus.addDriver(new DriverB<>("Иванов Иван Иванович", "yes", 12,new CategoryB()));
        Sponsor gazprom = new Sponsor<>("Gazprom", 2_500_000);
        Sponsor lukoil = new Sponsor<>("Lukoil", 4_000_000);
        lexus.addMechanic(ivan);
        lexus.addSponsor(gazprom, lukoil);

        Buses MAN = new Buses("МАН", "Lion", 4.7f, Capacity.AVERAGE);
        Mechanic<Buses> vasiliy = new Mechanic<Buses>("Василий", "Сергеев", "Агат");
        MAN.addDriver(new DriverD<>("Петров Василий Иванович", "yes", 16, new CategoryD()));
        Sponsor rosneft = new Sponsor<>("Rosneft", 4_500_000);
        Sponsor rosneft1 = new Sponsor<>("Rosneft", 4_500_000);
        MAN.addMechanic(vasiliy);
        MAN.addSponsor(rosneft);
        MAN.addSponsor(rosneft1);

        Trucks kamAz = new Trucks("КамАз", "6520", 4.0f, Weight.N1);
        Mechanic<Buses> petr = new Mechanic<>("Петр", "Николаев", "Авто-Трап");
        kamAz.addDriver(new DriverC<>("Васильев Василий Васильевич", "yes", 15, new CategoryC()));

        Sponsor rusal = new Sponsor<>("Rusal", 3_000_000);
        kamAz.addMechanic(petr);
        kamAz.addSponsor(rusal);

        printCar();
        service(kamAz, MAN, lexus);
        printCar();
        List<Transport> transports = List.of(lexus, MAN, kamAz);

        ServiceStation serviceStation=new ServiceStation();
        serviceStation.addPassengerCars(lexus );
        serviceStation.addTrucks(kamAz);
        serviceStation.carInspection();
        serviceStation.carInspection();

        for (Transport transport : transports) {
            printInfo(transport);
        }
    }

    private static void printInfo(Transport transport) {
        System.out.println(" Информация по автомобилю " + transport.getBrand() + transport.getModel());
        System.out.println("Водители: "+transport.getDrivers());
        System.out.println("Спонсоры: "+transport.getSponsors());
        System.out.println("Механики: "+transport.getMechanics());


    }
public static void printCar(){
    System.out.println("==========================");
}
    public static void service(Transport... transports) {
        for (Transport transport : transports) {
            try {
                if (!transport.service())
                    throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println(transport.getClass().getSimpleName() + " " + transport.getBrand() + " " + transport.getModel() + " необходимо пройти диагностику.");
            }
        }
    }
}