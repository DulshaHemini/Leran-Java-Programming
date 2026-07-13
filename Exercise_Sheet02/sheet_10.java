package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The year:  ");
        int year = sc.nextInt();
	  
        if((year %4 == 0 && year %100 != 0) || year % 400 == 0)
        {
            System.out.println("This is a Leap Year");
        }else{
            System.out.println("This is Not a Leap Year");
            }
        }
}
