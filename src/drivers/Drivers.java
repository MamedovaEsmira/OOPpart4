package drivers;

public abstract class Drivers {
  private String fullname;       // ФИО водителя
  private boolean driversLicense;//наличие водительских прав
  private int experience;        //стаж водителя

  public String validateStringParametrs(String value) {
    return value == null || value.isBlank() || value.isEmpty() ? "Васильев Петр Сергеевич" : value;
  }

  public int validateIntParametrs(int value) {
    return value <= 0 ? 1 : Math.abs(value);
  }

  public Drivers(String fullname, boolean driversLicense, int experience) {
    this.fullname = validateStringParametrs(fullname);
    this.driversLicense = driversLicense;
    this.experience = validateIntParametrs(experience);
  }

  public abstract void startMoving();

  public abstract void stopMoving();

  public abstract void refuelTheCar();

  public boolean isDriversLicense() {
    return driversLicense;
  }

  public void setDriversLicense(boolean driversLicense) {
    this.driversLicense = driversLicense;
  }

  public void setDriversLicense() {
    this.driversLicense = driversLicense;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  @Override
  public String toString() {
    return String.format("Водитель: %s со стажем вождения %d лет. Наличие прав: %b  будет учавствовать в заезде. \n",getFullname(),getExperience(),isDriversLicense());
  }
}
