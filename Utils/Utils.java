package Utils;

import java.util.ArrayList;
import java.util.List;


public class Utils {
	public static List<Double> argsToDoubleList(String[] args) throws RuntimeException {
        if (args.length <= 0) {
            throw new RuntimeException("ERRO! O programa precisa aceitar pelo menos dois números via linha de comando. Ex.: java QuestaoXX 5 6");
        }

        List<Double> numbers = new ArrayList<Double>();

        try {
            for (String arg : args) {
                numbers.add(Double.parseDouble(arg));
            }
        } catch (NumberFormatException err) {
            throw new RuntimeException("Argumento inválido passado para o programa. Verifique se foram passados apenas números.");
        }

        return numbers;
    }
}
