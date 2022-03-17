package io.boj10820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        /***
         * a ~ z : 97 ~ 122
         * A ~ Z : 65 ~ 90
         * 0 ~ 9 : 48 ~ 57
         * '' : 32
         */

        while ((s = buf.readLine()) != null) {
            int[] res = new int[4];

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    res[1]++;
                } else if (c >= 'a' && c <= 'z') {
                    res[0]++;
                } else if (c >= '0' && c <= '9') {
                    res[2]++;
                } else {
                    res[3]++;
                }
            }

            for (int i = 0; i < 4; i++) {
                System.out.print(res[i]+" ");
            }
        }

    }
}
