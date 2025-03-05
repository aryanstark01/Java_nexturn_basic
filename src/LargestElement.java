public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 34, 89, 23};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest element in the array: " + max);
    }
}

