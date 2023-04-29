import java.util.Scanner;
import java.util.Random;
public class ExercicioSeis {
  public static void main(String[] args) {
  System.out.println("Programa 6");
  Scanner scanner = new Scanner(System.in);
  System.out.printf("\nInforme o primeiro número: ");
  int numeroUm = scanner.nextInt();
  System.out.printf("\nInforme o segundo número: ");
  int numeroDois = scanner.nextInt();
  Random gerador = new Random();

  if (numeroUm > numeroDois){
    System.out.println("\nO maior número é: " + numeroUm);
    System.out.println("\nO menor número é: " + numeroDois);
    int aleatorio = gerador.nextInt(numeroDois, numeroUm);
    System.out.println("\nO número aleatório gerado é: " + aleatorio);
    if (aleatorio % 2 == 0){
      System.out.println("\nO número gerado é par!");
    }
    else {
      System.out.println("\nO múmero gerado é ímpar!");
    }
    }
  else if (numeroUm < numeroDois){
    System.out.println("\nO maior número é: " + numeroDois);
    System.out.println("\nO menor número é: " + numeroUm);
    int aleatorio = gerador.nextInt(numeroUm, numeroDois);
    System.out.println("\nO número aleatório gerado é: " + aleatorio);
    if (aleatorio % 2 == 0){
      System.out.println("\nO número gerado é par!");
    }
    else {
      System.out.println("\nO múmero gerado é ímpar!");
    }
    } 
  else if (numeroUm == numeroDois){
      System.out.println("\nOs números informados são iguais!");
    }
  else {
      System.out.println("\nErro!\nAlgo saiu errado!");
    }
    scanner.close();
  }
  }