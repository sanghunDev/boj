package io.boj10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(buf.readLine());

        for(int i = 0; i < n; i++) {
            String line = buf.readLine();
            String[] arr = line.split(" ");

            sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}