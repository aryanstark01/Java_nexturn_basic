public class ReverseStr {
    public static String reverse(String str) {
        // Base Case: If string is empty or has one character, return it as is
        if (str.isEmpty()) {
            return str;
        }
        // Recursive Case: Get last character + reverse the remaining string
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}
