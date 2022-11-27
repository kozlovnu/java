package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.println("Enter your number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("Triangle number of %d is %d\n", number, findTriangleNumber(number));
        System.out.printf("Factorial of number %d is %d\n", number, findFactorial(number));

        // Вывести все простые числа от 1 до 1000
        System.out.println("Prime numbers from 1 to 1000:");
        primeNumbers(1000);

        // Реализовать простой калькулятор
        System.out.println("Enter expresion:");
        Scanner list = new Scanner(System.in);
        String expression = list.nextLine();
        String[] calc = expression.split(" ");
        calculator(calc);
    }

    private static int findTriangleNumber(int number) {

        int triangle = 0;
        for (int i = 1; i <= number; i++) {
            triangle = triangle + i;
        }
        return triangle;
    }

    private static int findFactorial(int number) {

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static void primeNumbers(int number) {

        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 1; i < number + 1; i++) {
            long upperDiv = Math.round((Math.sqrt(i)));
            boolean flag = true;
            for (int j = 2; j < upperDiv + 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                output.add(i);

            flag = true;
        }
        if (output.get(0) == 1)
            output.remove(0);

        System.out.println(output.toString());
    }

    private static void calculator(String[] array) {
        float result = 0;
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {

                case "+":
                    result = Float.parseFloat(array[i - 1]) + Float.parseFloat(array[i + 1]);
                    System.out.println("result is " + result);
                    break;
                case "-":
                    result = Float.parseFloat(array[i - 1]) - Float.parseFloat(array[i + 1]);
                    System.out.println("result is " + result);
                    break;

                case "*":
                    result = Float.parseFloat(array[i - 1]) * Float.parseFloat(array[i + 1]);
                    System.out.println("result is " + result);
                    break;

                case "/":
                    if (Integer.parseInt(array[i + 1]) != 0) {
                        result = Float.parseFloat(array[i - 1]) / Float.parseFloat(array[i + 1]);
                        System.out.println("result is " + result);
                        break;
                    } else {
                        System.out.println("Division by zero");
                    }

            }

        }
    }

}
