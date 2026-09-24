// Copyright (C) 2025

package labcodingstandards;

import java.util.Scanner;

/**
 * Calculadora simple por consola.
 *
 * @author Yull Bazurto
 */
public class Calculator {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");

        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;

        while (true) {
            System.out.print("Enter first number: ");
            input = reader.nextLine();

            try {
                first = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        while (true) {
            System.out.print("Enter second number: ");
            input = reader.nextLine();

            try {
                second = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.operation(first, second, operator);

        System.out.println(result);
        reader.close();
    }

    /**
     * Realiza la operacion elegida con los dos numeros.
     *
     * @param first primer numero
     * @param second segundo numero
     * @param operator operador elegido (1 a 4)
     * @return mensaje con el resultado o con el error
     */
    private String operation(double first, double second, char operator) {
        double result = 0;
        switch (operator) {
            case '1':
                result = first + second;
                break;
            case '2':
                result = first - second;
                break;
            case '3':
                result = first * second;
                break;
            case '4':
                result = first / second;
                break;
            default:
                return "Error! operator is not correct";
        }
        return "The result is: " + result;
    }
}