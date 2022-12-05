package carRase;
 public class Buses extends Transport {

     private Capacity capacity;

     public Buses(String brand, String model, float engineVolume, Capacity capacity) {
         super(brand, model, engineVolume);
         this.capacity = capacity;
     }

     public Capacity getCapacity() {
         return capacity;
     }

     public void setCapacity(Capacity capacity) {
         this.capacity = capacity;
     }
     @Override
     public void startMove() {
         System.out.printf("Автобус: %s %s начинает движение. \n",getBrand(),getModel());
     }

     @Override
     public void stopMove() {
         System.out.printf("Автобус: %s %s заканчивает движение. \n",getBrand(),getModel());
     }

     @Override
     public void printType() {
         if (capacity == null) {
             System.out.println("Данных по авто недостаточно");
         } else {
             System.out.println("Тип вместимости автобуса: от " + capacity.getFrom()+ " до "+capacity.getTo() +" мест");
         }
     }

     @Override
     public String toString() {
         return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя: %.1f л.", Buses.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
     }

     @Override
     public boolean service() {
         System.out.println("Автобус " +getBrand() + "" + getModel() + " не нуждается в диагностике");
         return true;
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
