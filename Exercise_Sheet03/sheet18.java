import java.util.Scanner;
public class sheet18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter the Pin Number:  ");
            int pin = sc.nextInt();
            if (pin == 1234){
                break;
            }            
        }

    }
}
