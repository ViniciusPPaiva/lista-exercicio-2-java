import java.util.Scanner;
public class ExercicioCinco{
    public static void main(String[] args){
    System.out.println("Programa 5");

    Scanner scanner = new Scanner(System.in);
    System.out.printf("\nInforme o primeiro número: ");
    double numeroUm = scanner.nextDouble();

    System.out.printf("\nInforme o segundo número: ");
    double numeroDois = scanner.nextDouble();

    System.out.println("\nSímbolos de operações disponíveis: +, -, *, / e ^ ");
    System.out.println("\nEscolha um dos símbolos de operação disponíveis: ");
    String simbolo = scanner.next();


    switch (simbolo){
        case "+":
        System.out.printf("\nVocê selecionou Soma!\nO resultado da operação é: %.2f", (numeroUm + numeroDois));
        System.out.println("\nFim do programa!");
        break;
        case "-":
        System.out.printf("\nVocê selecionou Subtração!\nO resultado da operação é: %.2f", (numeroUm - numeroDois));
        System.out.println("\nFim do programa!");
        break;
        case "*":
        System.out.printf("\nVocê selecionou Multiplicação!\nO resultado da operação é: %.2f", (numeroUm * numeroDois));
        System.out.println("\nFim do programa!");
        break;
        case "/":
        System.out.printf("\nVocê selecionou Divisão!\nO resultado da operação é: %.2f", (numeroUm / numeroDois));
        System.out.println("\nFim do programa!");
        break;
        case "^":
        System.out.printf("\nVocê selecionou Potenciação!\nO resultado da operação é: %.2f", (Math.pow(numeroUm, numeroDois)));
        System.out.println("\nFim do programa!");
        break;
        default:
        System.out.println("\nSímbolo selecionado incorretamente!");
    }
    scanner.close();
    }
}