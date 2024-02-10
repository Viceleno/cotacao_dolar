import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto esta a cotacao do dolar?");
        double cot = sc.nextDouble();
        System.out.println("Quantos dolares voce ira comprar?");
        double dolar = sc.nextDouble();
        CurrencyConverter cc = new CurrencyConverter();
        double cv = cc.conversao(dolar, cot);

        System.out.printf("O valor a ser retirado em real com IOF e: %.2f", cv);

        sc.close();
    }
}
