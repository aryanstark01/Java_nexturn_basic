import java.util.Scanner;

public class PassCheck {
    public static void main(String[]args){
        final int pass= 2345;
        System.out.print("Enter your password:");
        Scanner sc = new Scanner(System.in);
        int newPass = sc.nextInt();
        int i=3;
        while(i>1){

            if(pass==newPass){
                System.out.println("Success");
                break;
            }
            else{
                i--;
                System.out.println("Attempt Left "+i);
                System.out.print("Wrong Password! Enter correct password:");
            }
             newPass = sc.nextInt();
        }

    }
}
