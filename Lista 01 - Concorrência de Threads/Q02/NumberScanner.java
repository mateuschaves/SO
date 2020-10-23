package Q02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberScanner extends Thread {

    public void run() {
        Matcher matchs = Pattern.compile("[0-9]{3}").matcher(Main.textInputed);
        while (matchs.find()) {
            System.out.print("Sequêcia de números: ");
            System.out.println(matchs.group());
            Main.textInputed = Main.textInputed.replace(matchs.group(), "");
        }
        System.out.println("");

    }
}
