package io.boj10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        buf.readLine();
        StringTokenizer st = new StringTokenizer(buf.readLine()," ");

        int iValue = 0;
        int maxVal = -1000001;
        int minVal = 1000001;

        while (st.hasMoreTokens()) {
            iValue = Integer.parseInt(st.nextToken());
            if (maxVal < iValue) {
                maxVal = iValue;
            }

            if (minVal > iValue) {
                minVal = iValue;
            }
        }
        System.out.println(minVal + " " + maxVal);
    }
}
