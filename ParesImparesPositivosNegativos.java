import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int par = 0, impar = 0, positivo = 0, negativo = 0;

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitor.nextInt();

        }

        for (int i = 0; i < numeros.length; i++) {
            // confere se eh par
            if ((numeros[i] % 2) == 0) {
                par++;
            }
            // confere se é impar
            if ((numeros[i] % 2) != 0) {
                impar++;
            }
            // confere se eh positivo
            if (numeros[i] > 0) {
                positivo++;
            }
            // confere se é negativo
            if (numeros[i] < 0) {
                negativo++;
            }
        }
        System.out.println(par + " valor (es) par (es)");
        System.out.println(impar + " valor (es) impar (es)");
        System.out.println(positivo + " valor (es) positivo (s)");
        System.out.println(negativo + " valor (es) negativo (s)");
    }

}
