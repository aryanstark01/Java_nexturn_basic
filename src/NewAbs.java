abstract class student{
   public String fname="Aryan Raj";
   public int roll= 32;
    public abstract void study();
}
class monitor extends student{
    public  void study(){
        System.out.println("This is the abstract function");
    }
}


public class NewAbs {
public static void main(String[]args){
    monitor obj=new monitor();
    System.out.println("Full name: "+ obj.fname);
    System.out.println("Full name: "+ obj.roll);
    obj.study();
}
}
