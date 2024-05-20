public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String input){

        StringBuilder result = new StringBuilder();

        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }

        return result.toString();
    }
}
