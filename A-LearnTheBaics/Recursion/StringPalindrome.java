public class StringPalindrome {

    static String str = "MADAM";

    public static void main(String[] args) {
        if (fun(0)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean fun(int i) {

        if (i >= str.length() / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }

        return fun(i + 1);
    }
}