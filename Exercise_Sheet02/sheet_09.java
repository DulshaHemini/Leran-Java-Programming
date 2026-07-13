package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month as a number:  ");
        int month = sc.nextInt();

        System.out.print("Enter the Date:  ");
        int date =  sc.nextInt();

        if((month==1|| month==3|| month==5|| month==7|| month==8|| month==10|| month==12) && (date>=1 && date <=31 )){
            System.out.println("Valid date");
        }
        else if((month==2)&& (date >=1 && date<=29)){
            System.out.println("Valid Date");    
        } 
        else if((month==4|| month==6|| month==9|| month==11) && (date>=1 && date <=30)){
            System.out.println("Valid Date");
        }
        else{
            System.out.println("Invalid Date");
        }

    }
}
