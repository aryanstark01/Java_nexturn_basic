public class EncapsulationEx {
    public static void main(String[]args){
        Person obj1= new Person();
        obj1.setname("Aryan Raj");
       System.out.println(obj1.getName());
    }
}
class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setname(String newName){
        this.name=newName;
    }

}



