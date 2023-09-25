/**
 * Auteur : Baptiste Dumas
 * Date de création : 25/09/2023
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Étape 1: Demandez à l'utilisateur de choisir un opérateur
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        int operatorChoice = scanner.nextInt();

        // Étape 7: Vérifiez si l'opérateur est valide (entre 1 et 5 inclus)
        if (operatorChoice < 1 || operatorChoice > 5) {
            System.out.println("Invalid operator choice. Please choose a valid operator (1-5).");
            scanner.close();
            return;
        }

        // Étape 4: Demandez à l'utilisateur les opérandes
        int[] operands = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter operand " + (i + 1) + ":");
            operands[i] = scanner.nextInt();
        }

        int result = 0;

        // Étape 6: Calculez le résultat en fonction de l'opérateur choisi
        switch (operatorChoice) {
            case 1:
                result = operands[0] + operands[1];
                break;
            case 2:
                result = operands[0] - operands[1];
                break;
            case 3:
                result = operands[0] * operands[1];
                break;
            case 4:
                if (operands[1] != 0) {
                    result = operands[0] / operands[1];
                } else {
                    System.out.println("Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                break;
            case 5:
                result = operands[0] % operands[1];
                break;
        }

        // Étape 6 (suite): Affichez le résultat
        System.out.println("The result is: " + result);

        scanner.close();
    }
}