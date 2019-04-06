import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int num) {
        List<Integer> factors = new ArrayList<>();

        if (num == 1) {
            return Arrays.asList(1);
        } else {
            if (num % 2 == 0) {
                factors.add(2);
                num /= 2;
            }

            if (num > 1) {
                factors.add(num);
            }
        }

        return factors;
    }
}
