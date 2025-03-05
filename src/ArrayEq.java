import java.util.Arrays;

public class ArrayEq {
    public static void main(String[]args){
        int[] arr1={2,3,4,5,1};
        int[] arr2={2,3,4,5,1};
        boolean isEqual= Arrays.equals(arr1,arr2);
        System.out.println("Are they equal?"+ isEqual);

    }
}
