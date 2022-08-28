import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int prod;

        System.out.print("digite o primeiro valor: \n");
        int PrimeiroValor = leitor.nextInt();

        System.out.print("digite o segundo valor: \n");
        int SegundoValor = leitor.nextInt();

        prod = PrimeiroValor * SegundoValor;

        System.out.println("PROD = " + prod);

    };
}