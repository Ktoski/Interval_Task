package interval;

import org.junit.Assert;
import org.junit.Test;

public class IntervalTests {

    @Test
    public void testIfDisjoint(){

        Interval interval1 = new Interval(1,5);
        Interval interval2 = new Interval(-4,2);

        boolean result = Interval.checkIfOverlap(interval1, interval2);

        Assert.assertTrue(result);
    }

    @Test
    public void testIfDisjoint2(){

        Interval interval2 = new Interval(12,15);
        Interval interval1 = new Interval(15,24);

        boolean result = Interval.checkIfOverlap(interval1, interval2);

        Assert.assertTrue(result);
    }

    @Test
    public void testCreateUnion1(){

        Interval interval2 = new Interval(42,44);
        Interval interval1 = new Interval(43,69);
        Interval intervalGoal = new Interval(42,69);

        Interval result = Interval.createUnionOverlap(interval2, interval1);

        System.out.println(result);
        Assert.assertEquals(result, intervalGoal);
    }

    @Test
    public void testCreateUnion2(){

        Interval interval2 = new Interval(15,24);
        Interval interval1 = new Interval(12,24);
        Interval intervalGoal = new Interval(12,24);

        Interval result = Interval.createUnionOverlap(interval2, interval1);

        System.out.println(result);
        Assert.assertEquals(result, intervalGoal);
    }
}
