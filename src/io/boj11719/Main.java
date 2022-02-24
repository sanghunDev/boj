package io.boj11719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";

        while((str = buf.readLine()) != null){
            sb.append(str);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
