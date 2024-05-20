public class RemoveWhiteSpace {

    public static void main(String[] args) {
        System.out.println(removeWhiteSpace("Hell opp a"));
    }

    public static String removeWhiteSpace(String input){
        return input.replace(" ","");
    }
}
