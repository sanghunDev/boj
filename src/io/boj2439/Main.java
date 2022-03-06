package io.boj2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int loopLeng = Integer.parseInt(buf.readLine());

        for (int i = 1; i <= loopLeng; i++) {
            for (int j = 1; j <= loopLeng-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
