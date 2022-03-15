package io.boj10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String inputVal = buf.readLine();
        int[] cntArray = new int[26];

        for (int i = 0; i < inputVal.length(); i++) {
            cntArray[inputVal.charAt(i)-97]++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(cntArray[i] + " ");
        }

    }
}
