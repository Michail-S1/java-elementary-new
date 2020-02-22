package java;

import java.util.Scanner;

public class Hoh {
    public static void main(String[] args) {
        recursionFucn();
    }

    private static void recursionFucn() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i);

        }
        recursionFucn();
    }

}