package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the Month:  ");
        int month = sc.nextInt();
        if(month >=0 && month<=12){
            System.out.println("This is a Vaild Month");
        } 
        else{
            System.out.println("This is not a valid month");
        } 

    }
}
