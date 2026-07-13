import java.util.Scanner;

public class sheet13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  Number:  ");
        int num = sc.nextInt();
        
        int count = 0 ;
        if (num < 2){
            System.out.println("This Number is Not a Prime Or Composite Number");
        }
        else{
            int x ;
            for( x=1 ; x <= num ; x++){
                if(num % x == 0){
                    count++ ;
                }
            }
        }
        if(count == 2){
            System.out.println("This is a Prime Number");
        }
        else{
            System.out.println("This is a Composite Number");
        }

    }
}
