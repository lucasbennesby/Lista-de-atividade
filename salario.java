import java.util.Scanner;

public class salario {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroFuncionario, horasTrabalhadas;
        double valorPorHora, salario;

        System.out.println("Digite o numero do funcionario: ");
        numeroFuncionario = leitor.nextInt();

        System.out.println("Digite o numero de horas trabalhadas: ");
        horasTrabalhadas = leitor.nextInt();

        System.out.println("Digite o valor por hora: ");
        valorPorHora = leitor.nextDouble();

        salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario + "\n" + "SALARY = U$ " + salario);

        // numero funciona =rio int
        // horas trabalhadas int
        // valor/hora float
        // salario = horas * valor/hora
    }
}
