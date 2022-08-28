import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double notaA, notaB, media;
        System.out.println("Digite a primeira Nota: ");
        notaA = leitor.nextFloat();

        System.out.println("Digite a segunda Nota: ");
        notaB = leitor.nextFloat();

        media = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        System.out.println("MEDIA = " + media);

    }
}
