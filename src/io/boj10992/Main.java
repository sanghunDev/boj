package io.boj10992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());

        for (int i = 1; i < n; i++) {
            System.out.printf(" ");
        }
        System.out.println("*");
        for (int i = 2; i <= n - 1; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.printf(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= (i-1)*2-1; k++) {
                System.out.printf(" ");
            }
            System.out.println("*");
        }

        if (n != 1) {
            for (int z = 1; z < 2 * n; z++) {
                System.out.printf("*");
            }
        }

    }
}
