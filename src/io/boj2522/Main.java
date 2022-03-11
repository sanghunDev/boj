package io.boj2522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int inputValue = Integer.parseInt(buf.readLine());

        for(int i=0,k=inputValue; i<2*inputValue; i++) {
            for(int j=0; j<inputValue; j++) {
                System.out.print(j<k-1?" ":"*");
            }
            if(i<inputValue-1)
                k--;
            else
                k++;
            System.out.println();
        }
    }
}
