package io.boj11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int loopLeng = Integer.parseInt(buf.readLine());
        String inputStr = buf.readLine();

        int sumTotal = 0;
        for (int i = 0; i < loopLeng; i++) {
            sumTotal += (inputStr.charAt(i)-'0');
        }

        System.out.println(sumTotal);
    }
}
