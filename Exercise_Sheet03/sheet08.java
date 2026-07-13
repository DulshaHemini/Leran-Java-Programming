import java.util.Scanner;
public class sheet08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number:  ");
        int F_num = sc.nextInt();

        System.out.print("Enter the Second Number:  ");
        int S_num = sc.nextInt();

        int count = 0 ;
        if (F_num < S_num){
            while (F_num < S_num ){
                if (F_num % 5 == 0){
                    count = count + 1 ;   
                }
                F_num++ ;
            }
        }
        else if(S_num < F_num){
            while (S_num<F_num){
                if (S_num % 5 == 0){
                    count = count + 1 ;
                }
                S_num++ ;
            }
        }
        else {
            System.out.println("Invalid Numbers!");
        }
        System.out.println("The Number Count is: " + count);

    }
}
