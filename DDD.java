import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // inicializa variaveis
        int[] DDD = { 61, 71, 11, 21, 32, 19, 27, 31 };
        String[] estado = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas",
                "Vitoria", "Belo Horizonte" };

        // a ja é iniciado com o valor de falso
        String a = "DDD nao cadastrado";

        System.out.println("digite o DDD: ");
        int DDDInput = leitor.nextInt();

        // percorre o array de DDD
        for (int i = 0; i < DDD.length; i++) {
            if (DDDInput == DDD[i]) {
                a = estado[i];
            }
        }

        System.out.println(a);

    }
}

// {61,71,11,21,32,19,27,31}