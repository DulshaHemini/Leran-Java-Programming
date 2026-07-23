import java.util.Scanner;
public class Assignment_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many teams? ");
        int teams = sc.nextInt();
        System.out.println();

        int max = 0;
        for(int i=1; i<=teams ; i++){
            System.out.print("How many members in team " + i +" ? ");
            int member = sc.nextInt();
            System.out.println();
            int Total_Score = 0 ;
            for(int j=1; j<=member; j++){
                System.out.print("Scores by player " +j + ": ");
                int player = sc.nextInt();
                Total_Score =  Total_Score + player ;
                if (max < Total_Score){
                    max = Total_Score ;
                }
            }
            System.out.println();
            System.out.println("\t\t Total scores of teams " + i+ ": " + Total_Score);
            System.out.println();

            
        }

        System.out.println("---------------------------------------------");
        System.out.println("Highest score by all teams: " + max);
        System.out.println("---------------------------------------------");
    
    }
}
