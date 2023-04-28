import java.util.Scanner; 
public class ExercicioTres{
public static void main(String[] args){
    System.out.println("Programa 3");
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Informe o valor do coeficiente A: ");
    int coeficienteA = scanner.nextInt();
    System.out.printf("Informe o valor do coeficiente B: ");
    int coeficienteB = scanner.nextInt();
    System.out.printf("Informe o valor do coeficiente C: ");
    int coeficienteC = scanner.nextInt();
    double delta = (Math.pow(coeficienteB, 2)) - (4 * coeficienteA * coeficienteC);

    if ((coeficienteA == 0) && (coeficienteB == 0 ) && (coeficienteC == 0)) {
    System.out.printf(("\nO resultado é 0! "));
    }
    else if ((coeficienteA == 0) && (coeficienteB == 0) && (coeficienteC != 0)) {
    System.out.println("\nCoeficientes informados incorretamente!");
    }
    else if (coeficienteA == 0) {
            System.out.printf(("\nEssa é uma equação do primeiro grau!"));
            double resultado = ((coeficienteC * (-1)) / coeficienteB);
            System.out.printf("\nO valor da raiz real é: %.2f ", (resultado));
        }
    else if (delta < 0 ){   
            System.out.printf("\nEssa equação não possui raízes reais! ");
        }
    else if (delta == 0){
            System.out.printf("\nEssa equação possui duas raízes reais iguais!");
            double raizIgual = ((coeficienteB * (-1))/ 2 * coeficienteA);
            System.out.printf("\nO resultado das duas raízes é: %.2f ", (raizIgual));
        }
    else {
            System.out.printf("\nEssa equação possui duas raízes reais diferentes!");
            double raizUm = ((coeficienteB *(-1)) + delta)/(2*coeficienteA);
            double raizDois = ((coeficienteB *(-1)) - delta)/(2*coeficienteA);
            System.out.printf("\nO resultado da primeira raiz é: %.2f", (raizUm));
            System.out.printf("\nO resultado da segunda raiz é: %.2f", (raizDois));    
        }

    scanner.close();
    }
}
