package collections;

import carRase.PassengerCars;
import carRase.Transport;
import carRase.Trucks;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

private final Queue<Transport>transports=new ArrayDeque<>();

private  void add(Transport transport){
    transports.offer(transport);
}
    public void addPassengerCars(PassengerCars passengerCars){
     add(passengerCars);
    }
    public void addTrucks(Trucks trucks){
        add(trucks);
    }
    public void carInspection(){
if (!transports.isEmpty()){
    Transport transport= transports.poll();
    boolean result= transport.service();
    if(!result){
        transport.repair();
    }
}
    }
}
