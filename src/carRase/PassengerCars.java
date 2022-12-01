package carRase;

public class PassengerCars extends Transport{

    private BodyType bodyType;

    public PassengerCars(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMove() {
        System.out.printf("Легковой автомобиль:  %s %s начинает движение. \n", getBrand(), getModel());
    }
    @Override
    public void stopMove() {
        System.out.printf("Легковой автомобиль:  %s %s заканчивает движение. \n", getBrand(), getModel());

    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно");
        }else {
            System.out.println("Тип кузова авто: "+ bodyType);
        }
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



