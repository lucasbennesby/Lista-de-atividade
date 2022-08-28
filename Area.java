import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double A, B, C, pi = 3.14159;

        double triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Digite o valor de A: ");
        A = leitor.nextFloat();

        System.out.println("Digite o valor de B: ");
        B = leitor.nextFloat();

        System.out.println("Digite o valor de C: ");
        C = leitor.nextFloat();

        triangulo = (A * C) / 2;

        circulo = (C * C) * pi;

        trapezio = ((A + B) * C) / 2;

        quadrado = (B * B);

        retangulo = (A * B);

        System.out.println("TRIANGULO: " + triangulo);
        System.out.println("CIRCULO: " + circulo);
        System.out.println("TRAPEZIO: " + trapezio);
        System.out.println("QUADRADO: " + quadrado);
        System.out.println("RETANGULO: " + retangulo);

    }
}

// triangulo = base A * altura C
// Circulo = raio C * pi²
// trapezio = base ((A + B)*C)/2
// quadrado = lado B
// retangulo = lados A * B