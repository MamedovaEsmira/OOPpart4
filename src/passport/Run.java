package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static passport.Passport.findPassportAtNumber;

public class Run {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        Passport ivanov = new Passport("1234", "Иванов", "Иван", "Иванович", LocalDate.now().minusYears(28));
        Passport petrov = new Passport("1234", "Петров", "Петр", "Николаевич", LocalDate.now().minusYears(34));
        Passport michaylov = new Passport("5874", "Михаилов", "Сергей", "Александрович", LocalDate.now().minusYears(58));
        ivanov.addPassport(passports);
        petrov.addPassport(passports);
        michaylov.addPassport(passports);

        findPassportAtNumber(passports, "5874");
        System.out.println(passports);

    }
}
