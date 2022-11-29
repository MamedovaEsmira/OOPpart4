import carRase.Buses;
import carRase.PassengerCars;
import carRase.Trucks;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;

public class Main {
    public static void main(String[] args) {

        PassengerCars lexus = new PassengerCars("Lexus","LX 570", 4.5f);
        PassengerCars porsche = new PassengerCars("Porsche","989", 5.2f);
        PassengerCars BMW = new PassengerCars("BMW","X7", 5.5f);
        PassengerCars audi = new PassengerCars("Audi","Q8", 3.8f);

        Buses MAN = new Buses("МАН","Lion",4.7f);
        Buses maz = new Buses("МАЗ","232",5.6f);
        Buses hyundai = new Buses("Hyundai","H350",4.2f);
        Buses volvo = new Buses("Volvo","9500",3.9f);

        Trucks kamAz = new Trucks("КамАз","6520",4.0f);
        Trucks iveco = new Trucks("Iveco","Daily",2.0f);
        Trucks daf = new Trucks("Daf","XE", 5.0f);
        Trucks isuzu = new Trucks("Isuzu","Elf",3.0f);

        DriverB<PassengerCars> ivanov=new DriverB<>("Иванов Иван Иванович",true,12);
        DriverB<PassengerCars> sergeev=new DriverB<>("Сергеев Сергей Сергеевич",true,22);

        DriverC<Trucks> nikulin=new DriverC<>("Никулин Иван Петрович",true,8);
        DriverC<Trucks> vasilyev=new DriverC<>("Васильев Василий Васильевич",false,15);

        DriverD<Buses> nosov=new DriverD<>("Носов Сергей Васильевич",true,6);
        DriverD<Buses> petrov=new DriverD<>("Петров Василий Иванович",false,16);

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
    }
public static void printCar(){
    System.out.println("==========================");
}
}