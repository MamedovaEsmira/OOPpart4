package carRase;

import collections.Mechanic;
import collections.Sponsor;
import drivers.Drivers;

import java.util.*;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private float engineVolume;

    private final List<Drivers<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor<?>> sponsors = new ArrayList<>();


    public String validateStringParameters(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "default" : value;
    }

    public float validateFloatParameters(float value) {
        return value == 0f ? 1.5f : Math.abs(value);
    }

    public Transport(String brand, String model, float engineVolume) {
        this.model = validateStringParameters(model);
        this.brand = validateStringParameters(brand);
        this.engineVolume = validateFloatParameters(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void addDriver(Drivers<?> drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor<?>... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<Drivers<?>> getDrivers() {
        return drivers;
    }

    public List<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Transport{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();
}


