package org.example.stratege.pattern;

import java.util.Scanner;

/**
 * @Author pw7563
 * @Date 2023/11/12 13:59
 * usage
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = new Context(new Add()).compute(x, y);
        System.out.println(result);
    }

}
