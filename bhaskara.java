import java.util.Scanner;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class bhaskara {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00000");
        df.setRoundingMode(RoundingMode.HALF_EVEN);

        double a, b, c, deltaNegativo, deltaPositivo;

        System.out.println("digite o valor de a");
        a = leitor.nextDouble();

        System.out.println("digite o valor de b");
        b = leitor.nextDouble();

        System.out.println("digite o valor de c");
        c = leitor.nextDouble();

        // x1 = (-b - delta)

        // delta
        deltaNegativo = Math.sqrt((b * b) - (4 * a * c));
        // -b - delta
        deltaNegativo = deltaNegativo - b;
        deltaNegativo = deltaNegativo / (2 * a);

        // x2 = (- b + delta)
        deltaPositivo = Math.sqrt((b * b) - (4 * a * c));
        deltaPositivo = -deltaPositivo - b;
        deltaPositivo = deltaPositivo / (2 * a);

        if ((Double.isNaN(deltaPositivo)) || (Double.isNaN(deltaNegativo))) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.println("R1 = " + df.format(deltaNegativo));
            System.out.println("R2 = " + df.format(deltaPositivo));

        }

    }

}
