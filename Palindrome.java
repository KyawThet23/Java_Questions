public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkIfPalin("Hello"));
    }

    public static boolean checkIfPalin(String input){

        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.toLowerCase().charAt(i) != input.toLowerCase().charAt(length - i - 1)){
                result = false;
                break;
            }
        }

        return result;
    }
}
