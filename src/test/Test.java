package test;

/**
 * @author gaohan
 * @version 1.0
 * @date 2020/5/18 12:47
 */
public class Test {
    public static void main(String[] args) {
        String str = "Hello Word!";
        Validate validate = new Validate();
        str = validate.check(str);
        if (str.equals("Error")) {
            System.err.println("String is Error!");
        } else {
            Validate2 validate2 = new Validate2();
            String res = validate2.validate(str);
            if (res.equals("Error")) {
                System.err.println("size is Error!");
            } else {
                System.out.println(str);
            }
        }
    }
}
