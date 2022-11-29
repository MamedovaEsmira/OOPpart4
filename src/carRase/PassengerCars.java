package carRase;

public class PassengerCars extends Transport{

    @Override
    public void startMove() {
        System.out.printf("Легковой автомобиль:  %s %s начинает движение. \n", getBrand(), getModel());
    }
    @Override
    public void stopMove() {
        System.out.printf("Легковой автомобиль:  %s %s заканчивает движение. \n", getBrand(), getModel());

    }
    public PassengerCars(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public String toString() {
        return String.format("Класс: %s , марка: %s, модель: %s, мощность двигателя: %.1f л.", PassengerCars.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s заезжает на Pit-stop.", getBrand(), getModel());
        System.out.printf("\nАвтомобиль %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время автомобиля %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1+ Math.random() * (4)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автомобиля  %s %s  составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * 200));
    }
}



