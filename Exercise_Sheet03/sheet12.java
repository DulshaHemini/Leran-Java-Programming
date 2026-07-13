import java.util.Scanner;
public class sheet12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number:  ");
        int num = sc.nextInt();

        int count = 0 ;
        int x ;
        for( x=1 ; x <= num ; x++){
            if(num % x == 0){
                count = count + 1 ;
            }
        }
        System.out.print("The count is: " + count );

    }
}
