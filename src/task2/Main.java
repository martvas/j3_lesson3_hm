package task2;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<FileInputStream> ali = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            ali.add(new FileInputStream("src/task2/lorem" + i + ".txt"));
        }

        SequenceInputStream sin = new SequenceInputStream(Collections.enumeration(ali));
        int x;
        while ((x = sin.read()) != -1) {
            System.out.print((char) x );
        }
        sin.close();
    }
}
