package carRase;
 public class Buses extends Transport {

     @Override
     public void startMove() {
         System.out.printf("Автобус: %s %s начинает движение. \n",getBrand(),getModel());
     }

     @Override
     public void stopMove() {
         System.out.printf("Автобус: %s %s заканчивает движение. \n",getBrand(),getModel());
     }

     public Buses(String brand, String model, float engineVolume) {
            super(brand, model,engineVolume);
        }
     @Override
     public String toString() {
         return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя: %.1f л.", Buses.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
     }

     @Override
     public void pitStop() {
         System.out.printf("Автобус %s %s заезжает на Pit-stop.", getBrand(), getModel());
         System.out.printf("\nАвтобус %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
     }

     @Override
     public void bestLapTime() {
         System.out.printf("Лучшее время Автобуса %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1+ Math.random() * (8)));
     }

     @Override
     public void maxSpeed() {
         System.out.printf("Максимальная скорость Автобуса  %s %s  составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * 180));
     }
 }
