public class ConstructorEx {
    String name;
    int num;
    ConstructorEx(){
        name="thara";
        num=12345678;
    }
    void show(){
        System.out.println(name+" "+num);
    }
    public static void main(String[] args) {
        ConstructorEx obj = new ConstructorEx(); // Creating object
        obj.show();  // Calling method
    }
}
