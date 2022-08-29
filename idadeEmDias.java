import java.util.Scanner;

public class idadeEmDias {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idadeDias, ano, mes, dia;

        System.out.println("Digite sua idade em dias: ");
        idadeDias = leitor.nextInt();
        // O(1)
        ano = 0;
        mes = 0;
        dia = 0;

        ano = (idadeDias / 365);
        mes = (idadeDias % 365) / 30;
        dia = (idadeDias % 365) % 30;

        // O(N)
        /*
         * while (idadeDias > 365) {
         * 
         * idadeDias = idadeDias - 365;
         * ano++;
         * 
         * }
         * mes = 0;
         * while (idadeDias > 30) {
         * idadeDias = idadeDias - 30;
         * mes++;
         * 
         * }
         * 
         * dia = idadeDias;
         */

        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dia + " dia (s)");

    }

}
