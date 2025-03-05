import java.util.Scanner;

public class FibbonaciNum {

    public static int Fiibo(int n){
        if(n<=1) return n;
        return Fiibo(n-1)+Fiibo(n-2);
    }
    public static void main(String[]args){
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number is: "+Fiibo(n));
    }
}
