
package Q02;

import java.util.Scanner;

public class Main {

    public static Scanner scanner;
    public static String textInputed;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        textInputed = scanner.nextLine();

        scanner.close();

        NumberScanner numberScanner = new NumberScanner();
        numberScanner.start();

        StringScanner stringScanner = new StringScanner();
        stringScanner.start();
    }

}