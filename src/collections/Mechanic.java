package collections;

import carRase.Transport;

public class Mechanic<T extends Transport> {
    private final String nameMechanic;
    private final String surname;
    private final String company;

    public Mechanic(String nameMechanic, String surname, String company) {
        this.nameMechanic = nameMechanic;
        this.surname = surname;
        this.company = company;
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }
    public boolean service(T t){
       return t.service();
    }
    public void repair(T t){
        t.repair();
    }

    @Override
    public String toString() {
        return nameMechanic + " " + surname  + " работает в компании " + company;
    }
}
