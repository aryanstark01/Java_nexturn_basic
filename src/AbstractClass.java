abstract class Trainer{
    abstract void Teach();
}

class Students extends Trainer{
    void Teach(){
        System.out.println("Training is going on");
    }
}

public class AbstractClass {
public static void main(String []args){
    Students obj1= new Students();
    obj1.Teach();
}
}
