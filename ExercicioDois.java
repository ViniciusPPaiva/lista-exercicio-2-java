import java.util.Scanner; 
public class ExercicioDois{
    public static void main(String[] args){
    System.out.println("Programa 2");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o valor da compra: ");
    int valorcom = scanner.nextInt();

    System.out.println("Informe o valor pago: ");
    int valorpa = scanner.nextInt();
    
    if (valorpa < valorcom){
    System.out.println("O valor pago é insficiente!");
    }
    else if (valorpa == valorcom){
        System.out.printf("\nPagamento aprovado! Seu troco é de: R$ 0.00");
    }
    else { 
        double valorTroco = valorpa - valorcom;
        double notaCinquenta = Math.floor(valorTroco/50);
        double notaVinte = Math.floor((valorTroco - ((50 * notaCinquenta)))/20);
        double notaDez = Math.floor((valorTroco - ((20 * notaVinte) + (50 * notaCinquenta)))/10);
        double notaCinco = Math.floor((valorTroco - ((10 * notaDez) + (20 * notaVinte) + (50 * notaCinquenta)))/5);
        double notaDois = Math.floor((valorTroco - ((5 * notaCinco) + (10 * notaDez) + (20 * notaVinte) + (50 * notaCinquenta)))/2);
        double moeda = Math.floor(valorTroco - ((50 * notaCinquenta) + (20 * notaVinte) + (10 * notaDez) + (5 * notaCinco) + (2 * notaDois)));
        System.out.printf("\nPagameto aprovado! Seu troco será de: ");
        System.out.printf("\nCédulas de R$50: %.0f ", (notaCinquenta));
        System.out.printf("\nCédulas de R$20: %.0f ", (notaVinte));
        System.out.printf("\nCédulas de R$10: %.0f ", (notaDez));
        System.out.printf("\nCédulas de R$5: %.0f ", (notaCinco));
        System.out.printf("\nCédulas de R$2: %.0f ", (notaDois));
        System.out.printf("\nMoedas de R$1: %.0f ", (moeda));
        System.out.printf("\nTotal: R$ %.0f %n", ((notaCinquenta * 50) + (notaVinte * 20) + (notaDez * 10) + (notaCinco * 5) + (notaDois * 2) + moeda));
    }
     scanner.close();
    }
}