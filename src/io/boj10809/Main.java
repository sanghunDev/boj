package io.boj10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String inputVal = buf.readLine();
        int[] cntArray = new int[26];

        for (int i = 0; i < cntArray.length; i++) {
            cntArray[i] = -1;
        }

        for (int i = 0; i < inputVal.length(); i++) {
            char ch = inputVal.charAt(i);

            if (cntArray[ch - 97] == -1) {
                cntArray[ch - 97] = i;
            }
        }

        for (int i = 0; i < cntArray.length; i++) {
            System.out.print(cntArray[i] + " ");
        }

    }
}
