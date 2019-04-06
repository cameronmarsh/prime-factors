import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class PrimeFactorsTest {

    @Test
    public void givenOneReturnsSingletonListContainingOne() {
        PrimeFactors primeFactors = new PrimeFactors();

        List<Integer> factors = primeFactors.generate(1);
        List<Integer> expected = Arrays.asList(1);

        assertThat(factors, is(expected));
    }


    @Test
    public void givenPrimeNumberReturnsSingletonListContainingOnlyThatNumber() {
        PrimeFactors primeFactors = new PrimeFactors();

        List<Integer> factors = primeFactors.generate(17);
        List<Integer> expected = Arrays.asList(17);

        assertThat(factors, is(expected));
    }
}
