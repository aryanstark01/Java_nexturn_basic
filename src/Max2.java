import java.util.Scanner;

public class Max2 {
    public static int maxi(int a,int b){
        if(a>b){
            return a;
        }
        else if(b>a){
            return b;
        }
        else{
            return a;
        }
    }
    public static void main(String[]args){
        System.out.println("Enter two numbers:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Max of two numbers "+maxi(a,b));
    }
}
