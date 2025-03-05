import java.util.Scanner;

import static java.lang.Long.sum;

public class SumRec {
    public static int Sum(int n){
        if (n == 0) {  // Base case: if n becomes 0, return 0
            return 0;
        }
        return (n % 10) + Sum(n / 10);
    }
    public static void main(String[]args){
        System.out.println("enter number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
