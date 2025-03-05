import java.util.Locale;
import java.util.Scanner;

public class Calories {
    public static void main(String[]args){
        System.out.println("Enter your activity: Running Swimming Cycling");
        Scanner sc= new Scanner(System.in);
        String activity= sc.nextLine().toLowerCase();
        System.out.println("Enter Duration:");
        int duration= sc.nextInt();

        switch(activity){
            case "running":
                System.out.println("Calories Burned:"+duration*10);
                break;
            case "cycling":
                System.out.println("Calories Burned:"+duration*10);
                break;

            case "swimming":
                System.out.println("Calories Burned:"+duration*10);
                break;
        }

    }
}
