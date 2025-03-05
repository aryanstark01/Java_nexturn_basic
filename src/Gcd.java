// two numbers using general
// approach
import java.util.*;
//import java.util.Scanner;

class Gcd {

    // gcd() method, returns the GCD of a and b
    static int  gcd(int a, int b)
    {
        // stores minimum(a, b)
        int i;

        if (a < b)
            i = a;
        else
            i = b;

        // take a loop iterating through smaller number to 1
        for (i = i; i > 1; i--) {

            // check if the current value of i divides both
            // numbers with remainder 0 if yes, then i is
            // the GCD of a and b
            if (a % i == 0 && b % i == 0)
                return i;
        }

        // if there are no common factors for a and b other
        // than 1, then GCD of a and b is 1
        return 1;
    }
    // Driver method
    public static void main(String[] args)
    {
//        int a = 30, b = 20;
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        // calling gcd() method over
        // the integers 30 and 20
        System.out.println("GCD = " + gcd(b, a));
    }
}

