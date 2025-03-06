class StudentEx {
    String name;
    int rollnumber;
    char grade;
    StudentEx(String name, int rollnumber, char grade){
        this.name= name;
        this.rollnumber= rollnumber;
        this.grade= grade;
    }
    void Display(){
        System.out.println("Name:"+ name);
        System.out.println("RollNumber:" + rollnumber);
        System.out.println("Grade:"+ grade);
    }
}
public class Student {
    public static void main(String[] args) {
            StudentEx s1= new StudentEx("Aryan",11,'A');
            s1.Display();
    }
}
