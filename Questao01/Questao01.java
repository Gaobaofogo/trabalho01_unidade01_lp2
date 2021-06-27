package Questao01;
import java.util.List;

import Utils.Utils;

public class Questao01 {
    public static void main(String[] args) {
        List<Double> numbers = Utils.argsToDoubleList(args);

        double n = numbers.size();
        double average = numbers.stream().reduce(0.0, Double::sum) / n;
        double s = Math.sqrt(
            (1 / (n - 1)) * numbers.stream().reduce(0.0, (xs, x) -> Math.pow(x - average, 2.0) + xs)
        );

        System.out.println(String.format("Média: %.4f", average));
        System.out.println(String.format("Desvio padrão amostral: %.4f", s));
    }
}
