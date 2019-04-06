import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class PrimeFactorsTest {

    private PrimeFactors primeFactors;



    private List<Integer> asList(int ... ints){
        List<Integer> list = new ArrayList<>();
        for(int i : ints){
            list.add(i);
        }

        return list;
    }


    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactors();
    }



    @Test
    public void givenOneReturnsSingletonListContainingOne() {
        List<Integer> factors = primeFactors.generate(1);
        List<Integer> expected = asList(1);

        assertThat(factors, is(expected));
    }


    @Test
    public void givenPrimeNumberReturnsSingletonListContainingOnlyThatNumber() {
        List<Integer> factors = primeFactors.generate(17);
        List<Integer> expected = asList(17);

        assertThat(factors, is(expected));
    }


    @Test
    public void givenFourReturnsListOfTwoTwos() {
        List<Integer> factors = primeFactors.generate(4);
        List<Integer> expected = asList(2, 2);

        assertThat(factors, is(expected));
    }


    @Test
    public void givenSixReturnsListOfTwoAndThree() {
        List<Integer> factors = primeFactors.generate(6);
        List<Integer> expected = asList(2, 3);

        assertThat(factors, is(expected));
    }


    @Test
    public void givenEightReturnsListOfThreeTwos() {
        List<Integer> factors = primeFactors.generate(8);
        List<Integer> expected = asList(2, 2, 2);

        assertThat(factors, is(expected));
    }
}
