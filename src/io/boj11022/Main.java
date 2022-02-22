package io.boj11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int loopLeng = Integer.parseInt(buf.readLine());

        for (int i = 0; i < loopLeng; i++) {
            String[] arr = buf.readLine().split(" ");
            int first = Integer.parseInt(arr[0]);
            int second = Integer.parseInt(arr[1]);
            int sumVal = first + second;
            sb.append("Case #" + (i+1) + ": " + first + " + " + second + " = " + sumVal + "\n");
        }
        System.out.println(sb);
    }
}
