
import java.util.Scanner;
public class BirthYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nume si varsta");
        int age = input.nextInt();
        try {
            if (age < 7 || age > 18) {
                throw
                        new InvalidException("Varsta nu poate fi mai mica de 7 si mai mare de 18");
            }
        } catch (InvalidException e) {
            System.err.println(e);
        }

        System.out.println("Introducere nume");
        String gender = input.next();
        try {
            if ((!gender.equals("male")) || (!gender.equals("female"))) {
                throw new InvalidException("Gender poate fi male sau female");
            }
        } catch (InvalidException e) {
            System.err.println(e);
        }

        System.out.println("Introducere nume");
        String name = input.next();
        try {


            if (name.length() < 10 || name.length() > 50) {
                throw new InvalidException("Lungimea numelui trebuie sa fie mai mare de 10 si mai mica de 50 caractere");
            }
        } catch (InvalidException e) {
            System.err.println(e);
        }

    }


    static class InvalidException extends Exception {
        String msg;
        int num;

        public InvalidException() {
            super();
        }

        public InvalidException(String msg) {
            super();
            this.msg = msg;
        }

        public InvalidException(int num) {
            super();
            this.num = num;
        }
    }
}