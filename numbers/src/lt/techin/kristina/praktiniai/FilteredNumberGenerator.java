package lt.techin.kristina.praktiniai;

import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class FilteredNumberGenerator implements IntegerGenerator {
    IntegerGenerator integerGenerator;
    NumberFilter numberFilter;

    public FilteredNumberGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        this.integerGenerator = integerGenerator;
        this.numberFilter = numberFilter;
    }

    @Override
    public Integer getNext() {
        Integer nextNumber = integerGenerator.getNext();
        while (nextNumber!=null && numberFilter.accept(nextNumber) == false){
            nextNumber = integerGenerator.getNext();
        }
        return nextNumber;
    }
}
