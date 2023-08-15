package funcionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream()
                .reduce(0, somar);

        System.out.println("A soma dos numeros é: " + resultado);

        int resultado1 = numeros.stream()
                .reduce(0, Integer::sum);

//        Optional<String> optionalValue = Optional.ofNullable(null);
//        String result = optionalValue.orElse("Default");
//        System.out.println(result);
    }
}
