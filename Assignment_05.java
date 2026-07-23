import java.util.Scanner;

public class Assignment_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Factor Finder ----");
        System.out.println();
        System.out.println();

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.println();
        System.out.print("Factors: ");

        int count = 0 ;
        for(int i=1 ; i<=num; i++){
            if(num % i == 0){
                System.out.print(i+ " ");
                count ++ ;
            }
        }
        System.out.println();
        System.out.println();
        if(count > 2){
            System.out.println("Composite Number");
        }else if(count == 2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Neither Prime or Composite Number");
        }

        System.out.println();
        System.out.println("--- Program End ---");
    }
}
