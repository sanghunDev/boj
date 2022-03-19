package io.boj11655;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputVal = buf.readLine();

        for (int i = 0; i < inputVal.length(); i++) {

            if (inputVal.charAt(i) >= 'a' && inputVal.charAt(i) <= 'z') {
                if ('z' < inputVal.charAt(i) + 13) {
                    bw.write(('a' - 1) + ((inputVal.charAt(i) + 13) - 'z'));
                } else {
                    bw.write(inputVal.charAt(i) + 13);
                }
            } else if (inputVal.charAt(i) >= 'A' && inputVal.charAt(i) <= 'Z') {
                if ('Z' < inputVal.charAt(i) + 13) {
                    bw.write(('A' - 1) + ((inputVal.charAt(i) + 13) - 'Z'));
                } else {
                    bw.write(inputVal.charAt(i) + 13);
                }
            } else {
                bw.write(inputVal.charAt(i));
            }
        }

        bw.flush();
    }
}
