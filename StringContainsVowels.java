public class StringContainsVowels {

    public static void main(String[] args) {
        System.out.println(ifVowelContains("Prod"));
    }

    private static boolean ifVowelContains(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
