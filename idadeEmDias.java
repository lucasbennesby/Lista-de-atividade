import java.util.Scanner;

public class idadeEmDias {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idadeDias, ano, mes, dia;

        System.out.println("Digite sua idade em dias: ");
        idadeDias = leitor.nextInt();
        ano = 0;
        while (idadeDias > 365) {

            idadeDias = idadeDias - 365;
            ano++;

        }
        mes = 0;
        while (idadeDias > 30) {
            idadeDias = idadeDias - 30;
            mes++;

        }

        dia = idadeDias;
        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dia + " dia (s)");

    }

}
