import java.util.Scanner;
public class sheet07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number:  ");
        int F_num = sc.nextInt();

        System.out.print("Enter the Second Number:  ");
        int S_num = sc.nextInt();

        if (F_num < S_num){
            while (F_num < S_num ){
                if (F_num % 5 == 0){
                    System.out.print(F_num +" ");
                }
                F_num++ ;
            }
        }
        else if(S_num < F_num){
            while (S_num<F_num){
                if (S_num % 5 == 0){
                    // Print numbers
                    System.out.print(S_num +" ");
                }
                S_num++ ;
            }
        }
        else {
            System.out.println("Invalid Numbers!");
        }
    }
}