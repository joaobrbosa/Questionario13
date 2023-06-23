package Questao2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite o primeiro número: ");
			int num1 = scanner.nextInt();

			System.out.print("Digite o segundo número: ");
			int num2 = scanner.nextInt();

			System.out.print("Digite a operação (+, -, *, /): ");
			char operacao = scanner.next().charAt(0);

			double resultado;

			switch (operacao) {
			case '+':
				resultado = num1 + num2;
				System.out.println("Resultado: " + resultado);
				break;
			case '-':
				resultado = num1 - num2;
				System.out.println("Resultado: " + resultado);
				break;
			case '*':
				resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
				break;
			case '/':
				if (num2 == 0) {
					throw new ArithmeticException("Divisão por zero não é permitida.");
				}
				resultado = (double) num1 / num2;
				System.out.println("Resultado: " + resultado);
				break;
			default:
				System.out.println("Operação inválida.");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado não suportado. Digite apenas números inteiros.");
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero: " + e.getMessage());
		}
	}
}
