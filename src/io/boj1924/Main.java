package io.boj1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String[] dateArray = buf.readLine().split(" ");
        String[] weekArray = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] endDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int month = Integer.parseInt(dateArray[0])-1;
        int day = Integer.parseInt(dateArray[1]);

        for (int i=0; i < month; i++) {
            day += endDays[i];
        }

        System.out.println(weekArray[day % 7]);
    }
}
