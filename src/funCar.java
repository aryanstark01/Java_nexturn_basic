import java.util.*;
public class funCar {
    public static void main(String []  args) {

        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        int b = c.nextInt();
        char ch = c.next().charAt(0);
        if(a>b) {
             System.out.println("Greater");
        } else if (b>a) {
            System.out.println("Smaller");
        }else{
            System.out.println("Equal");
        }


        switch (ch) {
            case '+':
                System.out.println("add" + (a + b));
                break;

            case '-':
                System.out.println("sub" + (a - b));
                break;

            default:
                System.out.println("wrong");
        }
    }
}
