public class MethodOverL {
    public static int mul(int a, int b){
        return a*b;
    }
    public static int mul(int a, int b,int c){
        return a*b*c;
    }
    public static void main(String[]args){
       System.out.println(mul(2,3));
        System.out.println(mul(2,9,8));
    }
}
