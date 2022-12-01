package carRase;

import java.util.Objects;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private float engineVolume;

    public String validateStringParameters(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "default" : value;
    }

    public float validateFloatParameters(float value) {
        return value == 0f ? 1.5f : Math.abs(value);
    }

    public abstract void startMove();

    public abstract void stopMove();
    public abstract void printType();
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
}


