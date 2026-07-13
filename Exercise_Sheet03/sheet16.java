import java.util.Scanner;
public class sheet16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tot = 0 ;
        int x ;
        float avg = 0 ;
        for(x=1 ; x <= 5 ; x++){
            System.out.print("Enter the Subject " + x + " Marks:  ");
            int marks = sc.nextInt();
            tot = tot + marks ;
        }
        avg = tot / 5 ;
        System.out.println("Total marks is:  " + tot);
        System.out.println("Averege Marks is:  " + avg + "%");

    }
}
