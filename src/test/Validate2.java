package test;

public class Validate2 {
    private int len;

    public Validate2() {
        len = 12;
    }

    public String validate(String a) {
        if (a.length() > len) {
            return "Error";
        }
        return a;
    }
}
