package carRase;

public class Trucks extends Transport {
    @Override
    public void startMove() {
        System.out.printf("Грузовой автомобиль:  %s %s начинает движение. \n", getBrand(), getModel());
    }
    @Override
    public void stopMove() {
        System.out.printf("Грузовой автомобиль:  %s %s заканчивает движение. \n", getBrand(), getModel());

    }
    public Trucks(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя: %.1f л.",
                Trucks.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовой автомобиль: марка: %s, модель: %s,  заезжает на Pit-Stop",  getBrand(), getModel());
        System.out.printf("Грузовой автомобиль: марка: %s, модель: %s, завершил обслуживание и  выезжает из Pit-Stop",  getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время грузовика %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1 + Math.random() * (20)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость грузовика  %s %s составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * (150)));
    }
}
