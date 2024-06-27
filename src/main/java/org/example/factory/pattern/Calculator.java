package org.example.factory.pattern;

import java.util.Scanner;

/**
 * @Author pw7563
 * @Date 2023/11/9 21:43
 * usage
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String operation = scanner.next();
        ComputeFactory computeFactory = new ComputeFactory();
        BaseCompute computeFactory1 = computeFactory.getComputeFactory(operation);
        Double compute = computeFactory1.compute(num1, num2);
        System.out.println(compute);
    }




}
