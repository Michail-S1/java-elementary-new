package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean stop = false;
        String i = scanner.next();
        int a = scanner.nextInt();
        if (i.equals("stop")) {
            stop = true;
        }
        while (stop == true) {
            sum += Integer.parseInt(i);
            i = scanner.next();
            if (i.equals("stop")) {
                stop = true;
                System.out.println(sum);
            }

        }
    }
}
