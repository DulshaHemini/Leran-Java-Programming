package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int lastTwoDigits = num % 100;

        if (lastTwoDigits == 11 ||
            lastTwoDigits == 12 ||
            lastTwoDigits == 13) {

            System.out.println(num + " = " + num + "th");
        }
        else if (lastDigit == 1) {
            System.out.println(num + " = " + num + "st");
        }
        else if (lastDigit == 2) {
            System.out.println(num + " = " + num + "nd");
        }
        else if (lastDigit == 3) {
            System.out.println(num + " = " + num + "rd");
        }
        else {
            System.out.println(num + " = " + num + "th");
        }
    }
}
