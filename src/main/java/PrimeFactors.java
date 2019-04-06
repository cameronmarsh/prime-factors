import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int num) {
        List<Integer> factors = new ArrayList<>();

        if (num == 1) {
            return Collections.singletonList(1);
        }

        for (int divisor = 2; num > 1; divisor++) {
            while (num % divisor == 0) {
                factors.add(divisor);
                num /= divisor;
            }
        }

        return factors;
    }
}
