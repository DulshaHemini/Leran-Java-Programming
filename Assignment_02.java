import java.util.Scanner;
public class Assignment_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Salary Calculator---------");
        System.out.println();
        System.out.println();

        System.out.print("Enter the number of worked days: ");
        int x=sc.nextInt();
        System.out.print("Enter the daily payment: ");
        int y=sc.nextInt();
        System.out.println();
        System.out.println();

        System.out.print("Total Payment: ");
        int t=x*y;
        System.out.println(t);
        System.out.print("Bonus: ");
        int b=t*25/100;
        System.out.println(b);
        System.out.print("ETF: ");
        int e=(t*8/100);
        System.out.println(e);
        
        System.out.print("Net Salary: ");
        int n=(t+b)-e;
        System.out.println(n);
   
}
}