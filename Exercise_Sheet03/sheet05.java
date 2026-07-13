import java.util.Scanner;

public class sheet05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number:  ");
        int F_num = sc.nextInt();

        System.out.print("Enter the Second Number:  ");
        int S_num = sc.nextInt();

        if (F_num < S_num){
            while (F_num < S_num ){
                System.out.print(F_num +" ");
                F_num++ ;
            }
        }
        else if(S_num < F_num){
            while (S_num<F_num){
                System.out.print(S_num +" ");
                S_num++ ;
            }
        }
        else {
            System.out.println("Invalid Numbers!");
        }

    }
}
