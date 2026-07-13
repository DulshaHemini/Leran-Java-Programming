import java.util.Scanner;
public class sheet_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter the Power:  ");
            int power = sc.nextInt(); 

            System.out.print("Enter the Base:  ");
            int base = sc.nextInt();

            int x , Number = 1  ;
            for(x = 1 ; x <= power ; x++){
                Number = Number * base ; 
            }
            System.out.println("The output of " + base + " power of "+ power + " is " + Number);

    }
}
