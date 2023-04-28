import java.util.Scanner;
public class ExercicioQuatro{
  public static void main(String[] args){
    System.out.printf("Programa 4\n");
    System.out.printf("Operações disponíveis: \n1: Calcular Perímetro \n2: Calcular Área \n3: Calcular Volume %n");

    Scanner scanner = new Scanner(System.in);
    System.out.println("\nInforme qual a operação deseja realizar:");
    int operacao = scanner.nextInt();
    System.out.println("Informe o raio do círculo/esfera: ");
    double raio = scanner.nextDouble();

    switch (operacao) {
      case 1:
        double perimetro = raio *(2 * Math.PI); 
        System.out.printf("\nVocê selecionou: Calcular Perímetro!\nO perímetro do círculo é: %.2f", (perimetro));
        System.out.printf("\nFim do programa!");
        break;
      case 2:
        double area = (Math.pow(raio, 2)) * Math.PI;
        System.out.printf("\nVocê selecionou: Calcular Área\nA área do círculo é: %.2f", (area));
        System.out.printf("\nFim do programa!");
        break;
      case 3: 
        double volume = ((4 * Math.PI) * Math.pow(raio, 3))/3;
        System.out.printf("Você selecionou: Calcular Volume\nO volume da esfera é: %.2f",(volume));
        System.out.printf("\nFim do programa!");
        break;
      default:
        System.out.printf("\nCódigo da operação inválido!\nFim do programa! %n");
    }
    scanner.close();
  }
}