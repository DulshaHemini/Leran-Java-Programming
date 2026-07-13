package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Marks:  ");
        int marks = sc.nextInt();

        if (marks>=75 && marks<=100){
            System.out.println("A");
        }
        else if(marks>=65 && marks<=74){
            System.out.println("B");
        }
        else if (marks>=55 && marks<=64){
            System.out.println("C");
        }
        else if(marks>=35 && marks<=54){
            System.out.println("S");
        }
        else{
            System.out.println("F");
        } 

    }
}
