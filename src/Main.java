import carRase.*;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import exception.Data;

public class Main {
    public static void main(String[] args) {

        PassengerCars lexus = new PassengerCars("Lexus","LX 570", 4.5f, BodyType.CROSSOVER);
        PassengerCars porsche = new PassengerCars("Porsche","989", 5.2f, null);
        PassengerCars BMW = new PassengerCars("BMW","X7", 5.5f, BodyType.JEEP);
        PassengerCars audi = new PassengerCars("Audi","Q8", 3.8f, BodyType.CROSSOVER);

        Buses MAN = new Buses("МАН","Lion",4.7f, Capacity.AVERAGE);
        Buses maz = new Buses("МАЗ","232",5.6f,Capacity.ESPECIALLY_BIG);
        Buses hyundai = new Buses("Hyundai","H350",4.2f,null);
        Buses volvo = new Buses("Volvo","9500",3.9f,Capacity.ESPECIALLY_SMALL);

        Trucks kamAz = new Trucks("КамАз","6520",4.0f, Weight.N1);
        Trucks iveco = new Trucks("Iveco","Daily",2.0f, null);
        Trucks daf = new Trucks("Daf","XE", 5.0f, Weight.N3);
        Trucks isuzu = new Trucks("Isuzu","Elf",3.0f, Weight.N2);

        DriverB<PassengerCars> ivanov=new DriverB<>("Иванов Иван Иванович","yes",12);
        DriverB<PassengerCars> sergeev=new DriverB<>("Сергеев Сергей Сергеевич","yes",22);

        DriverC<Trucks> nikulin=new DriverC<>("Никулин Иван Петрович","no",8);
        DriverC<Trucks> vasilyev=new DriverC<>("Васильев Василий Васильевич","yes",15);

        DriverD<Buses> nosov=new DriverD<>("Носов Сергей Васильевич","yes",6);
        DriverD<Buses> petrov=new DriverD<>("Петров Василий Иванович","no",16);

        System.out.println(lexus);
        System.out.println(porsche);
        System.out.println(BMW);
        System.out.println(audi);
        printCar();
        System.out.println(MAN);
        System.out.println(maz);
        System.out.println(hyundai);
        System.out.println(volvo);
        printCar();
        System.out.println(kamAz);
        System.out.println(iveco);
        System.out.println(daf);
        System.out.println(isuzu);
        printCar();
        System.out.println(ivanov);
        System.out.println(sergeev);
        System.out.println(nikulin);
        System.out.println(vasilyev);
        System.out.println(nosov);
        System.out.println(petrov);
        printCar();
        ivanov.startMoving();
        sergeev.startMoving();
        nikulin.startMoving();
        vasilyev.startMoving();
        nosov.startMoving();
        petrov.startMoving();
        printCar();
        ivanov.stopMoving();
        sergeev.stopMoving();
        nikulin.stopMoving();
        vasilyev.stopMoving();
        nosov.stopMoving();
        petrov.stopMoving();
        printCar();
        ivanov.refuelTheCar();
        sergeev.refuelTheCar();
        nikulin.refuelTheCar();
        vasilyev.refuelTheCar();
        nosov.refuelTheCar();
        petrov.refuelTheCar();
        printCar();
        ivanov.driverB(audi);
        sergeev.driverB(BMW);
        nikulin.driverC(kamAz);
        vasilyev.driverC(iveco);
        nosov.driverD(MAN);
        petrov.driverD(volvo);
        printCar();
        lexus.bestLapTime();
        BMW.maxSpeed();
        kamAz.bestLapTime();
        volvo.maxSpeed();
        porsche.maxSpeed();
        MAN.bestLapTime();
        maz.maxSpeed();
        porsche.pitStop();
        lexus.pitStop();
        maz.pitStop();
        printCar();
        audi.printType();
        daf.printType();
        isuzu.printType();
        iveco.printType();
        hyundai.printType();
        kamAz.printType();
        volvo.printType();
        MAN.printType();
        maz.printType();
        porsche.printType();
        lexus.printType();
        maz.printType();
        printCar();
        boolean success= Data.validate("test!","test","test");
        if(success){
            System.out.println("Данные валидны");
        }else {
            System.out.println("Данные не валидны");
        }
        printCar();
        service(audi, daf, isuzu, iveco, hyundai, kamAz, volvo,
        MAN, maz, porsche, lexus, maz);
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