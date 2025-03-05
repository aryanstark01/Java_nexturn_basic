public class MethodEx {
    static void Smethod(){
        System.out.println("This is a static method");
    }

     void NSmethod(){
        System.out.println("This is Non static method");
    }
    public static void main(String[]args){
        MethodEx obj = new MethodEx();
        obj.NSmethod();
        Smethod();

    }
}
