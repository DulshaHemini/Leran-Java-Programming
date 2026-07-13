package Exercise_Sheet02;
import java.util.Scanner;
public class sheet_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Angel:  ");
        int angel = sc.nextInt();

        if(angel==0){
            System.out.println("Zero Angle");
        }
        else if(angel>=1 && angel<=89){
            System.out.println("Acute angle");
        }
        else if(angel==90){
            System.out.println("Right angle");
        }
        else if(angel>=91 && angel<=179){
            System.out.println("Obtuse angle");
        }
        else if(angel==180){
            System.out.println("Straight angle");
        }
        else if(angel>=181 && angel<=359){
            System.out.println("Reflex angle");
        }
        else{
            System.out.println("Full angle");
        }

    }
}
