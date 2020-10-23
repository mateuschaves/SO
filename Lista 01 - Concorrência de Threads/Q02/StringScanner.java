package Q02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringScanner extends Thread {

    public void run() {
        Matcher matchs = Pattern.compile("[A-Z]{3}", Pattern.CASE_INSENSITIVE).matcher(Main.textInputed);
        while (matchs.find()) {
            System.out.print("Sequêcia de letras: ");
            System.out.println(matchs.group());
            Main.textInputed = Main.textInputed.replace(matchs.group(), "");
        }
        System.out.println("");
    }
}
