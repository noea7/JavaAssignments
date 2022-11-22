package lt.techin.kristina.praktiniai;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class ExercisesImplementation implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> numbers) {
        return numbers.stream().min((int1,int2)->int1-int2).orElse(0);
    }

    @Override
    public Integer findLargest(List<Integer> numbers) {
        return numbers.stream().max((int1,int2)->int1-int2).orElse(0);
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o==o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> integerList = new ArrayList<>();
        while (iterator.hasNext()){
            integerList.add(iterator.next());
        }
        return integerList;
    }

    @Override
    public int computeSumOfNumbers(int number) {
        int sum = 0;
        for (int i = 1; i<=number; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int computeSumOfNumbers(int number, NumberFilter numberFilter) {
        int sum = 0;
        for (int i = 1; i<=number; i++) {
            if (numberFilter.accept(i)) {
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int number) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i<number; i++) {
            integerList.add(i);
        }
        return integerList;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> numbers) {
        Map<Integer,Integer> occurrences = new HashMap<>();
        for (Integer number : numbers) {
            if (occurrences.containsKey(number)) {
                Integer value = occurrences.get(number);
                value++;
                occurrences.replace(number,value);
            }
            else {
                occurrences.put(number,1);
            }
        }
        return occurrences;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new IntegerGeneratorImplementation(i,i1);
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return new FilteredNumberGenerator(integerGenerator,numberFilter);
    }
}
