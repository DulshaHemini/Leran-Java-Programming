package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Latter:  ");
        String L = sc.nextLine();

        switch (L)
        {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
        case "A":
        case "E":
        case "I":
        case "O":
        case "U":
        
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consanant");
        }

    }
}
