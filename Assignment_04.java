import java.util.Scanner;
public class Assignment_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        if(month > 0 && month <=12){
            if(month == 2){
                System.out.print("Enter the date: ");
                int date = sc.nextInt();
                if(date > 0 && date <= 28){
                    System.out.println("Valid Date");
                }else{
                    System.out.println("Invalid Date");
                }
            }else if(month == 4|| month == 6 || month == 11){
                System.out.print("Enter the date: ");
                int date = sc.nextInt();
                if(date > 0 && date <= 30){
                    System.out.println("Valid Date");
                }else{
                    System.out.println("Invalid Date");
                }
            }else{
                System.out.print("Enter the date: ");
                int date = sc.nextInt();
                if(date > 0 && date <= 31){
                    System.out.println("Valid Date");
                }
            }
    }else{
        System.out.println("Invalid Month");
    }
    
}

}