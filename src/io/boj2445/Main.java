package io.boj2445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int inputVal = Integer.parseInt(buf.readLine());
        int loopLeng = inputVal * 2;

        int startIdx = 0;
        int endIdx = 0;

        for (int i = 1; i <= loopLeng-1; i++) {
            if(i <= inputVal){
                startIdx = i;
                endIdx = loopLeng - i;
            }else{
                startIdx = loopLeng - i;
                endIdx = i;
            }

            for (int k = 1; k <= loopLeng; k++) {
                if(k <= startIdx || k > endIdx){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
