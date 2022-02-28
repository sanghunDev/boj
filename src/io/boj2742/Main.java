package io.boj2742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int loopLeng = Integer.parseInt(buf.readLine());

        for (int i = loopLeng; 1 <= i; i--) {
            System.out.println(i);
        }
    }
}
