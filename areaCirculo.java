import java.util.Scanner;

public class areaCirculo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float raio;
        float pi = 3.14159f;
        System.out.print("Digite o raio do circulo \n");

        raio = leitor.nextFloat();

        float area = pi * (raio * raio);

        System.out.print("a area do circulo eh: " + area);

    };
}