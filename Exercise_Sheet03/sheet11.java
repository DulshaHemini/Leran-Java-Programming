import java.util.Scanner;
public class sheet11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number:  ");
        int num = sc.nextInt();

        int x  ;
        for( x=1 ; x <= num ; x++){
            if(num % x == 0){
                System.out.print(x + " ");
            }
        }


    }
}
