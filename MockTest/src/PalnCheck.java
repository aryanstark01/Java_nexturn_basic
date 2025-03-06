import java.util.Scanner;
public class PalnCheck {
    public static boolean PalString(String str){
        int left=0;
        int right= str.length()-1;
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }




    public static void main(String[]args){
       System.out.println("Enter any string:");
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       if(PalString(str)){
           System.out.println("Yes this is a PAlindrome");
       }
       else{
           System.out.println("No this isn't a PAlindrome");
       }

    }

}
