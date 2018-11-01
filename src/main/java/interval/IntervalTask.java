package interval;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntervalTask {


    public int solution(int [] A, int [] B){


        int lengthOfArray = A.length;
        Set<Interval> unionsSet = new HashSet<>();

        for(int i = 0; i < lengthOfArray; i++) {
            for (int j = i + 1; j < lengthOfArray; j++) {

                Interval interval_1 = new Interval(A[i], B[i]);
                Interval interval_2 = new Interval(A[j], B[j]);

                unionsSet.add(interval_1);
                unionsSet.add(interval_2);

            }
        }
        return calculateUnions(unionsSet);
    }


    private int calculateUnions(Set<Interval> intervals){

        boolean anyOverlaping = false;

        System.out.println("anyOverlaping1: " + anyOverlaping);
        List<Interval> intervalsList = new ArrayList<>(intervals);
        List<Interval> tempList = new ArrayList<>(intervals);

        int size = intervals.size();

        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++) {


                if(Interval.checkIfOverlap(intervalsList.get(i), intervalsList.get(j))){

                    tempList.add(Interval.createUnionOverlap(intervalsList.get(i), intervalsList.get(j)));
                    System.out.println("added to set: " + Interval.createUnionOverlap(intervalsList.get(i), intervalsList.get(j)));
                    System.out.println("1: " + intervalsList.get(i) + " 2: " + intervalsList.get(j));
                    anyOverlaping = true;
                    System.out.println("anyOverlaping2: " + anyOverlaping);
                    tempList.remove(intervalsList.get(i));
                    tempList.remove(intervalsList.get(j));

                }
            }
        }


        Set<Interval> unions = new HashSet<>(tempList);

        System.out.println("unions: " + unions);
        if(anyOverlaping)
            calculateUnions(unions);

        return unions.size();
    }

}