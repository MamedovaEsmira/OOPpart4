package carRase;

public class Trucks extends Transport {

    private Weight weight;
    private boolean service;
    public Trucks(String brand, String model, float engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }
      public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
    @Override
    public void startMove() {
        System.out.printf("Грузовой автомобиль:  %s %s начинает движение. \n", getBrand(), getModel());
    }
    @Override
    public void stopMove() {
        System.out.printf("Грузовой автомобиль:  %s %s заканчивает движение. \n", getBrand(), getModel());

    }

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("Данных по авто недостаточно");
        }else {
            String from= weight.getFrom()==null? " ": "от "+weight.getFrom()+" тонн ";
            String to= weight.getTo()==null? " ": "до "+weight.getTo()+" тонн ";
            System.out.println("Тип грузоподьемности авто: "+ from+to);
        }
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя: %.1f л.",
                Trucks.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public boolean service() {
        if (service) {
            System.out.println("Грузовой автомобиль: " + getBrand() + " " + getModel() + " прошел диагностику.");
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void repair() {
        System.out.println("Грузовик "+getBrand()+" " +getModel()+" починен!");
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
