import java.util.Scanner;

public class sheet10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number:  ");
        int num = sc.nextInt();

        int x= 1;
        while (x <= num){
            int T_num =(x*(x + 1)) / 2 ;
            System.out.println(T_num + " ");
            x++ ;
        }

    }
}
