package task3;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите страницу:");
        int pageNumber = sc.nextInt();
        showPage(pageNumber);
    }

    public static void showPage(int pageNumber) throws Exception {
        int correctPageNumber = pageNumber - 1;
        int symbolsOnPage = 1800;
        byte[] b = new byte[1800];
        int pageToShow = correctPageNumber * symbolsOnPage;

        RandomAccessFile raf = new RandomAccessFile("src/task3/war_peace_text.txt", "r");
        raf.seek(pageToShow);
        raf.read(b, 0, 1800);
        for (int i = 0; i < b.length; i++) {
            System.out.print((char)b[i]);
        }
        raf.close();
    }
}
