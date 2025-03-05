import java.util.Scanner;

public class GradeSys {
    public static void main(String[]args){

        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        switch(Num/10){
            case 10:
                System.out.println("Grade A");
                break;
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            case 5,4,3,2,1,0:
                System.out.println("FAIL");
                break;
        }
    }
}
