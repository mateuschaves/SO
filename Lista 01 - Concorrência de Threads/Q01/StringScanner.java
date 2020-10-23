package Q01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringScanner extends Thread {

    public void run() {
        Matcher matchs = Pattern.compile("[A-Z]{3}", Pattern.CASE_INSENSITIVE).matcher(Main.textInputed);
        System.out.print("Sequêcia de letras encontradas: ");
        while (matchs.find()) {
            System.out.print(matchs.group());
        }
        System.out.println("");
    }
}
