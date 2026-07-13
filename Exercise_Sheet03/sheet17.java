import java.util.Scanner;
public class sheet17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Students:  ");
        int students = sc.nextInt();
        System.out.println();

        int tot = 0 ;
        int max = 0 ;
        int x ; 
        for(x=1 ; x <= students ; x++){
            System.out.print("Enter the " + x + " Students's Marks:  ");
            int marks = sc.nextInt();
            tot = tot + marks ; 
            if (max < marks){
                max =  marks ;
            }
        }
        System.out.println("The Total marks of All Students is:  " + tot);
        System.out.println();
        System.out.println("The Highest Marks In All Students is:  "+ max);


    }
}
