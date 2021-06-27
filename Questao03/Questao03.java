package Questao03;
import java.util.List;

import Utils.Utils;

public class Questao03 {
    public static void main(String[] args) {
    	List<Double> numbers = Utils.argsToDoubleList(args);
        Average avg = new Average(numbers);

        System.out.println(String.format("Média: %.4f", avg.avg()));
    }
}

class Average {
    private List<Double> numbers;
    private int size;

    Average(List<Double> numbers) {
        this.numbers = numbers;
        this.size = numbers.size();
    }

    public double avg() {
        return avg(this.numbers, this.size, 0.0);
    }

    private double avg(List<Double> numbers, int length, double total) {
        if (this.numbers.isEmpty()) {
            return total / length;
        }

        return avg(numbers.subList(0, numbers.size() - 1), length, total + numbers.get(numbers.size() - 1));
    }
}