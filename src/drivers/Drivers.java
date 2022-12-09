package drivers;

import category.Category;

public abstract class Drivers<C extends Category> {
  private String fullname;       // ФИО водителя
  private String driversLicense;//наличие водительских прав
  private int experience;        //стаж водителя
  private C category;


  public String validateStringParametrs(String value) {
    return value == null || value.isBlank() || value.isEmpty() ? "Васильев Петр Сергеевич" : value;
  }

  public int validateIntParametrs(int value) {
    return value <= 0 ? 1 : Math.abs(value);
  }

  public Drivers(String fullname, String driversLicense, int experience,C category) {
    this.fullname = validateStringParametrs(fullname);
    this.driversLicense = driversLicense;
    this.experience = validateIntParametrs(experience);
    this.category = category;

  }

  public abstract void startMoving();

  public abstract void stopMoving();

  public abstract void refuelTheCar();

  public void testLicense() {
    if (!getDriverLicense().isBlank() || !getDriverLicense().isEmpty()) {
      System.out.println("Тип прав для данного водителя: " + getDriverLicense() + ".");
    } else {
      throw new RuntimeException("Необходимо указать тип прав!");
    }
  }
  public String getDriverLicense() {
    return driversLicense;
  }

  public void setDriverLicense(String typeDriverLicense) {
    this.driversLicense = validateStringParametrs(typeDriverLicense);
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

  public String getDriversLicense() {
    return driversLicense;
  }

  public C getCategory() {
    return category;
  }

  public void setCategory(C category) {
    this.category = category;
  }

  public void setDriversLicense(String driversLicense) {
    this.driversLicense = driversLicense;
  }

  @Override
  public String toString() {
    return String.format("Водитель: %s со стажем вождения %d лет. Права категории: %s  будет учавствовать в заезде. \n",getFullname(),getExperience(),getCategory());
  }

  public abstract void addDrivers(Drivers<?> driver);

  public void add(Drivers<?> driver) {
  }
}
