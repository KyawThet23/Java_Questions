import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {

        Printer<Integer> intPrinter = new Printer<>(23);
        intPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(2.3);
        doublePrinter.print();

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);
    }

    private static void printList(List<?> myList){

    }

}
