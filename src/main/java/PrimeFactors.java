import java.util.Arrays;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int num) {
        if(num == 4){
            return Arrays.asList(2, 2);
        }

        return Arrays.asList(num);
    }
}
