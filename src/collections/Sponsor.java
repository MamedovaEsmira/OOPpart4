package collections;

import java.util.Objects;

public class Sponsor<T> {
    private final String nameSponsor;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.nameSponsor = name;
        this.amount = amount;
    }
 public void sponsorRace(){
     System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n ",nameSponsor,amount);
 }

    public String getNameSponsor() {
        return nameSponsor;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return nameSponsor +" сумма поддержки "+ amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        return amount == sponsor.amount && Objects.equals(nameSponsor, sponsor.nameSponsor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSponsor, amount);
    }
}
