package Questao04;
import java.util.List;

import Utils.Utils;

public class Questao04 {
	public static void main(String[] args) {
        List<Double> numbers = Utils.argsToDoubleList(args);

        System.out.println(
            String.format("Cálculo: %.4f",
            Questao04.calc(numbers, 0.0, 0.0, numbers.size()))
        );
    }

    public static double calc(List<Double> numbers, double x1, double x2, int n) {
        if (numbers.isEmpty()) {
            return Math.sqrt(
                ((1.0/n) * x1) - Math.pow((1.0/n) * x2, 2.0)
            );
        }

        double xi = numbers.get(numbers.size() - 1);

        return calc(
            numbers.subList(0, numbers.size() - 1),
            x1 + Math.pow(xi, 2.0),
            x2 + xi,
            n
        );
    }
}
