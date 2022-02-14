package io.boj1000;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.(한줄로 입력)
        Scanner scan = new Scanner(System.in);
        int firstVal = scan.nextInt();
        int secondVal = scan.nextInt();

        System.out.print(firstVal + secondVal);
    }
}
