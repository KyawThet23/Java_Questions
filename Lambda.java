public class Lambda {

    public static void main(String[] args) {

        printThing(s -> "Meow " + s);
    }

    static void printThing(LambdaPrinter thing){
        System.out.println(thing.print("!"));
    }

}
