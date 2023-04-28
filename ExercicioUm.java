import java.util.Scanner;
public class ExercicioUm{
    public static void main(String[] args){
    System.out.println("Programa 1");

    Scanner scanner = new Scanner(System.in);
    System.out.printf("\nInforme o primeiro número: ");
    double numeroUm = scanner.nextDouble();

    System.out.printf("\nInforme o segundo número: " );
    double numeroDois = scanner.nextDouble();

    System.out.printf("\nInforme o terceiro número: ");
    double numeroTres = scanner.nextDouble();

    double aritimetica = (numeroUm + numeroDois + numeroTres)/3;

    if ((numeroUm > numeroDois) && (numeroDois > numeroTres)){
        System.out.printf("\nO maior número é: %.0f \n", (numeroUm));
    }
    else if ((numeroUm > numeroDois) && (numeroDois < numeroTres) &&  (numeroUm > numeroTres)){
        System.out.printf("\nO maior número é: %.0f \n", (numeroUm));
    }
    else if ((numeroUm > numeroDois) && (numeroDois < numeroTres) &&  (numeroUm < numeroTres)){
        System.out.printf("\nO maior número é: %.0f \n", (numeroTres));
    }
    else if ((numeroDois > numeroUm) && (numeroUm > numeroTres)){
        System.out.printf("\nO maior número é: %.0f \n", (numeroDois) );
    }
    else if ((numeroDois > numeroTres) && (numeroTres > numeroUm)){
        System.out.printf("\nO maior número é: %.0f \n", (numeroDois) );
    }
    else if ((numeroTres > numeroUm) && (numeroUm > numeroDois)){//
        System.out.printf("\nO maior número é: %.0f \n", (numeroTres) ); 
    }
    else if((numeroTres > numeroDois) && (numeroDois > numeroUm)){
        System.out.printf("\nO maior número é: %.0f \n", (numeroTres) ); 
    }
    else if ((numeroTres == numeroDois) || (numeroUm == numeroDois)){
        System.out.printf("\nErro!\nHá números iguais!\n"); 
    }
    else{
        System.out.println("\nErro!\nAlgo saiu errado!");
    }

    if ((numeroUm < numeroDois) && (numeroDois < numeroTres)){
        System.out.printf("\nO menor número é: %.0f \n", (numeroUm));
    }
    else if ((numeroDois > numeroUm) && (numeroUm > numeroTres)){
        System.out.printf("\nO menor número é: %.0f \n", (numeroTres));
    }
    else if ((numeroUm < numeroDois) && (numeroTres < numeroDois)){
        System.out.printf("\nO menor número é: %.0f \n", (numeroUm));
    }
    else if ((numeroDois < numeroUm) && (numeroUm < numeroTres)){
        System.out.printf("\nO menor número é: %.0f \n", (numeroDois) );
    }
    else if ((numeroTres < numeroUm) && (numeroUm < numeroDois)){
        System.out.printf("\nO menor número é: %.0f \n", (numeroTres) ); 
    }
    else if((numeroTres < numeroDois) && (numeroDois < numeroUm)){
        System.out.printf("\nO menor número é: %.0f \n", (numeroTres) ); 
    }
    else if((numeroUm > numeroDois) && (numeroDois < numeroTres)){
        System.out.printf("\nO menor número é: %.0f \n", (numeroDois) ); 
    }

    else{
        System.out.println("\nErro!\nAlgo saiu errado!");
    }
   
    System.out.printf("\nA média aritiméica dos números escolhidos é: %.2f \n", (aritimetica));
    
    scanner.close();
    }
}
