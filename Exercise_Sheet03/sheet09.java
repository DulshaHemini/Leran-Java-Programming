import java.util.Scanner;

public class sheet09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number:  ");
        int num = sc.nextInt();

        int x = 1 ;
        while(x <= num){
            System.out.print(x + " ");
            x++ ;
        }
    }
}
