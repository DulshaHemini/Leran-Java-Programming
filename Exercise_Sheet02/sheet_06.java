package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the used units: ");
        int unit = sc.nextInt();

        if(unit>=0 && unit <=90){
            int bill = unit * 10 ;
            System.out.println("The bill is: " + bill);
        }else if(unit>=91 && unit<=300){
            int bill = ((unit - 90) * 15) + (900);
            System.out.println("The bill is: " + bill);
        }else{
            int bill = ((unit - 300)*25) + (4050)  ;
            System.out.println("The bill is: " + bill);
        }
    }
}
