import java.util.*;
public class TwoDArray {
    public static void main(String[]args){
        int rows=3;
        int cols=3;
        int[][] mat = new int[rows][cols];
        System.out.println("Enter elements");
        Scanner sc = new Scanner(System.in);
        //Taking input......
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        //Printing elements.....
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat[i][j]+" ");
            }
                System.out.println();
        }
//         sc.close();
    }
}
