package task1;

import java.io.FileInputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("src/task1/task1.txt");
        byte[] bytes = new byte[in.available()];
        in.read(bytes);
        System.out.println(Arrays.toString(bytes));
        in.close();
    }
}
