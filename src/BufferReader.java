import java.io.BufferedReader;//imports buffer class
import java.io.IOException;// needed for input output
import java.io.InputStreamReader;// converts byte stream into character


public class BufferReader {
    public static void main(String[]args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name:");
        String name = br.readLine();
        System.out.println("Here is the name "+name);
    }
}
