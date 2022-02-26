package io.boj11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = buf.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            if(i % 10 == 0 && i != 0) {
                sb.append("\n");
            }
            sb.append(inputStr.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
