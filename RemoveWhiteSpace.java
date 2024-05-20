public class RemoveWhiteSpace {

    public static void main(String[] args) {
        System.out.println(removeWhiteSpace("Hell opp a"));

        System.out.println(removeLeadingWhiteSpace("  abc  def\t"));
    }

    public static String removeWhiteSpace(String input){
        return input.replace(" ","");
    }

    public static String removeLeadingWhiteSpace(String input){
        return input.strip();
    }
}
