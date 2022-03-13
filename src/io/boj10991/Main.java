package io.boj10991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <n - i -1; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < i+1; k++) {
                System.out.print("*");
                if (k < i + 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
