package test;

import java.io.IOException;
import java.util.Iterator;

/**
 * @author gaohan
 * @version 1.0
 * @date 2020/5/16 9:53
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Database a = Database.getInstance();
//        a.load( "C:\\Users\\gaohan\\Downloads\\test\\input.txt" );
//        a.save( "C:\\Users\\gaohan\\Downloads\\test\\output.txt");
        a.initialise("C:\\Users\\gaohan\\Downloads\\test\\output.txt");
        for (Iterator<String> it = a.internalArray.iterator(); it.hasNext(); ) {
            String next = (String) it.next();
            System.out.println(next);
        }
    }
}
