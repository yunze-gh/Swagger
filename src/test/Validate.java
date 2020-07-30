package test;

import java.util.regex.Pattern;

public class Validate {

    public Validate() {
    }

    public String validate(String a) {
        if (Pattern.compile("^[A-Z]").matcher(a).find() == true) {
            return "Error";
        }
        return a;
    }

    public String check(String a) {
        String[] str = a.split(" ");
        for (String s : str) {
            char[] strChar = s.toCharArray();
            char firstChar = strChar[0];
            if ((int) firstChar > 64 && (int) firstChar < 91) {
                continue;
            } else {
                return "Error";
            }
        }
        return a;
    }
}
