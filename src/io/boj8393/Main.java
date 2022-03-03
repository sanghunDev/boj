package io.boj8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int loopLeng = Integer.parseInt(buf.readLine());
        int total = 0;

        for (int i=1; i <= loopLeng; i++) {
          total += i;
        }

        System.out.println(total);
    }
}
