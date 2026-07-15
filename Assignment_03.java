import java.util.Scanner;

public class Assignment_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of worked days: ");
        int days = sc.nextInt();

        int salary = 0;
        int bonus = 0;

        if (days > 0){
            System.out.print("Enter the daily payment: ");
            int payment = sc.nextInt();
            if(payment > 0){
                salary = days * payment ;
                if(days > 20){
                    bonus = (days-20)*1500 ;
                }
                int netSalary = salary + bonus ;

                System.out.println("Total Payment: " + salary);
                System.out.println("Bonus: " + bonus);
                System.out.println("Net Salary: " + netSalary);
                
            }else{
                System.out.println("Invalid amount");
            }
        }else{
            System.out.println("Invalid number");
        }


    }
}
