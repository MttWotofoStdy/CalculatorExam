package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математический пример: ");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);

        if(a > 10 || b > 10 || a < 1 || b < 1) {
            throw new Exception("Вы ввели неверное число в значение");
        }

            switch (elements[1])
            {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                default:
                    throw new Exception("Вы ввели действие не предусмотренное программой");
            }
    }
}
