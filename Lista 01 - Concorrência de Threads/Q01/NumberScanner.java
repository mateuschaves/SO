package Q01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberScanner extends Thread {

    public void run() {
        Matcher matchs = Pattern.compile("[0-9]{3}").matcher(Main.textInputed);
        System.out.print("Sequêcia de números encontradas: ");
        while (matchs.find()) {
            System.out.print(matchs.group());
        }
        System.out.println("");

    }
}
