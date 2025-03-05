class first{
    public void fullThrottle(){
        System.out.println("Car is in full speed");
    }
    public void maxspeed(int speed){
        System.out.println("Max Speed:"+ speed);
    }
}
public class Second {
  public static void main(String[]args){
      first obj= new first();
      obj.fullThrottle();
      obj.maxspeed(40);
  }
}
