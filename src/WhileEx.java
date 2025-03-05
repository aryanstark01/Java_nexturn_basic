import java.util.Scanner;

public class WhileEx {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        while(i>1){
            System.out.println(i);
            i--;
        }
    }
}
