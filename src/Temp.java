import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Temp {
//    private static Object System;

    public static void main(String[] args) {
     Scanner sc= new Scanner( System.in);
     double temp = sc.nextDouble();

     if(temp<10){
         System.out.println("cold");
     }

     else if(temp>=10 && temp <=19.99){
         System.out.println("Moderate");
     }
     else if(temp>=20 && temp <=30){
         System.out.println("Warm");
     }
     else{
         System.out.println("HOT");
     }

    }
}