interface A{
    void show();
}
interface B{
    void show();
}
class D implements A,B{
    public void show(){
        System.out.println("This is a diamond problem");
    }
}


public class InterfaceEx {
    public static void main(String[]args){
        D obj1= new D();
        obj1.show();
    }

}
