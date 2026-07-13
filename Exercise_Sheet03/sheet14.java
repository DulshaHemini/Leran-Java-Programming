import java.util.Scanner;
public class sheet14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :  ");
        int num = sc.nextInt();

        int fact  = 1 ; 
        int x  ;
        for(x=num ; x >= 1 ; x--){
            fact = fact * x ;
        }
        System.out.println("Factorial Number of " + num + " is " + fact);

    }
}
