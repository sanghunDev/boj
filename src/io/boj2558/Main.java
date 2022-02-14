package io.boj2558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.(줄 바꿔서 입력)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstVal = Integer.parseInt(br.readLine());
        int secondVal = Integer.parseInt(br.readLine());

        System.out.print(firstVal + secondVal);
    }
}
