import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int num) {
        List<Integer> factors = new ArrayList<>();

        if (num == 1) {
            return Arrays.asList(1);
        } else {
            int divisor = 2;
            while(num > 1 & divisor <= num) {
                while (num % divisor == 0) {
                    factors.add(divisor);
                    num /= divisor;
                }
                divisor++;
            }
        }

        return factors;
    }

    private boolean isDivisibleByTwo(int num) {
        return num % 2 == 0;
    }
}
