package Questao02;
import java.util.List;

import Utils.Utils;

public class Questao02 {
    public static void main(String[] args) {
        List<Double> numbers = Utils.argsToDoubleList(args);

        System.out.println(String.format("Média: %.4f", Questao02.average(numbers, numbers.size(), 0.0)));

    }

    public static double average(List<Double> numbers, int length, double total) {
        if (numbers.isEmpty()) {
            return total / length;
        }

        return average(numbers.subList(0, numbers.size() - 1), length, total + numbers.get(numbers.size() - 1));
    }
}