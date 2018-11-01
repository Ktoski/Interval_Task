package interval;

import java.util.Objects;

public final class Interval {

    private final int a;
    private final int b;

    public Interval(int a, int b){
        this.a = a;
        this.b = b;
    }


    public static boolean checkIfOverlap(Interval X, Interval Y){
        return (X.a < Y.a && X.a < Y.b && X.b >= Y.a) || (Y.a < X.a && Y.a < X.b && Y.b >= X.a);
    }

    public static Interval createUnionOverlap(Interval X, Interval Y){

        int new_a;
        int new_b;

        new_a = Math.min(X.a, Y.a);
        new_b = Math.max(X.b, Y.b);

        return new Interval(new_a, new_b);
    }


    @Override
    public String toString() {
        return "Interval{" +
                "a= " + a +
                ", b= " + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return a == interval.a &&
                b == interval.b;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b);
    }
}
