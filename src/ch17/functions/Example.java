package ch17.functions;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example {

    static void main() {
        Comparator<BigDecimal> comparator = (x,y) -> {
            if(x.doubleValue() == y.doubleValue()){
                return 0;
            } else if(x.doubleValue() > y.doubleValue()){
                return -1;
            }else {
                return 1;
            }
        };

        int result = comparator.compare(BigDecimal.valueOf(3000), BigDecimal.valueOf(5000));
        System.out.println(result);

        Set<BigDecimal> allOurMonies = new TreeSet<>(comparator);
        allOurMonies.add(BigDecimal.valueOf(30000));
        allOurMonies.add(BigDecimal.valueOf(5000));
        allOurMonies.add(BigDecimal.valueOf(1000));
        allOurMonies.add(BigDecimal.valueOf(9000));
        System.out.println(allOurMonies);



    }
}
