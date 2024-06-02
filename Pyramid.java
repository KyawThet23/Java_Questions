import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the rows to print:");
        int rows = scanner.nextInt();
        // System.out.println("Rows = "+rows);
        scanner.close();

        System.out.println("Printing Pattern \n");
        printPattern(rows);
    }

    private static void printPattern(int rows){
        for (int i = 0; i <= rows; i++) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = rows - i;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print numbers
            printString(i + " ", i);

            //move to next line
            System.out.println("");
        }
    }

    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }
}
