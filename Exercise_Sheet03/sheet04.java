import java.util.Scanner;
public class sheet04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 1 ;
        while (x < 20) {
            if( x % 2 == 0){
                System.out.println(x + " ");
            }
            x++ ;
        }
    }
}
