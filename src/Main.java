import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.id = 1234567;
        passport.name = "Donalьdbek";
        passport.firstName = "Tramp Tegi";
        passport.yearOfBirth = "01.01.2027";
        passport.gender = 'M';
        passport.countryOfBirth = "Bishkek";

        System.out.println("ID");
        System.out.println(passport.id);
        System.out.println();
        System.out.println("NAME");
        System.out.println(passport.name);
        System.out.println();
        System.out.println("FIRST NAME");
        System.out.println(passport.firstName);
        System.out.println();
        System.out.println("YEAR OF BIRTH");
        System.out.println(passport.yearOfBirth);
        System.out.println();
        System.out.println("GENDER");
        System.out.println(passport.gender);
        System.out.println();
        System.out.println("COUNTRY OF BIRTH");
        System.out.println(passport.countryOfBirth);
    }
}