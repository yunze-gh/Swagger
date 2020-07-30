package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author gaohan
 * @version 1.0
 * @date 2020/5/16 9:52
 */
public class Database {

    private static Database myObj;

    public ArrayList<String> internalArray = new ArrayList<String>();

    private Database() {
    }

    public static Database getInstance() {
        if (myObj == null) {
            myObj = new Database();
        }
        return myObj;
    }

    public synchronized void initialise(String filename) throws IOException {
        FileOutputStream file = new FileOutputStream(filename);
        file.write(new String("").getBytes());
        file.close();
        myObj = null;
        internalArray.clear();
    }


    public synchronized void load(String filename) throws IOException {
        File File = new File(filename);
        String inString;
        try (BufferedReader reader = new BufferedReader(new FileReader(File))) {
            while ((inString = reader.readLine()) != null)
                internalArray.add(inString);
            reader.close();
        }

    }

    public synchronized void save(String filename) throws IOException {
        File inFile = new File(filename);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(inFile))) {
            for (Iterator<String> it = internalArray.iterator(); it.hasNext(); )
                bw.write((String) it.next() + "\r\n");
            bw.close();
        }
    }

}
