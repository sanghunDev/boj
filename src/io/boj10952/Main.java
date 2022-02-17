package io.boj10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";

        while(!"0 0".equals((str = buf.readLine()))) {
            String[] arr = str.split(" ");

            sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}