package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Birth Year: ");
        int bYear = sc.nextInt();

        System.out.print("Enter Birth Month: ");
        int bMonth = sc.nextInt();

        System.out.print("Enter Birth Day: ");
        int bDay = sc.nextInt();

        System.out.print("Enter Current Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Current Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Current Day: ");
        int day = sc.nextInt();

        int ageYear = year - bYear;
        int ageMonth = month - bMonth;
        int ageDay = day - bDay;

        
        if (ageDay < 0) {
            ageDay += 30; 
            ageMonth--;
        }

        if (ageMonth < 0) {
            ageMonth += 12;
            ageYear--;
        }

        System.out.println("Your Age is : "
                + ageYear + " years "
                + ageMonth + " months "
                + ageDay + " days");
    }
}
