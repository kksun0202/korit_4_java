package ch07_loops;

import java.util.Scanner;

/*
    몇 줄의 별을 찍겠습니까? >>> 3
    ***
    **
    *
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 줄의 별을 찍겠습니까? >>> ");
        int row = scanner.nextInt();

        // # 1 풀이
        for (int i = row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // # 2 풀이
        for (int i = 0; i < row; i++){
            for (int j = row; j-i > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
