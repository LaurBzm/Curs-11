    import java.util.Scanner;

    import java.util.*;
    import java.lang.*;

    public class Digits {


        public static int firstDigit(int n)
        {

            while (n >= 10)
                n /= 10;


            return n;
        }


        public static int lastDigit(int n)
        {

            return (n % 10);
        }


        }


    public int lastDigit(int number) {
            int last = number % 10;
            return last;

        }




    class SumOfDigits
    {
        public static void main(String arg[])
        {
            long number, sum;
            Scanner sc=new Scanner(System.in);
            System.out.print("Introducere numar: ");

            number=sc.nextLong();

            for(sum=0; number!=0; number=number/10)
            {

                sum = sum + number % 10;
            }

            System.out.println("Suma digits: " + sum);
        }
    }

    public void main() {
    }