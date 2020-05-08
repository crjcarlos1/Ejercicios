package ejercicio17programacionfuncional.e0;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String... args) {
        List<Integer> numbers = Arrays.asList(5, 6, 7, 1, 2, 3, 4, 9, 8, 0);

        /**imperativo*/
        int count = 0;
        for (Integer number : numbers)
            if (number > 4) count++;
        System.out.println("Imperativo: " + count);

        /**funcional*/
        long result = numbers.stream().filter(number -> number > 4).count();
        System.out.println("Funcional: " + result);
    }

}
