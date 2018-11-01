package interval;

public class IntervalRunner {

    public static void main(String []args){

        int [] A = new int[]{1, 12, 42, 70, 36, -4, 43, 15};
        int [] B = new int[]{5, 15, 44, 72, 36, 2, 69, 24};

        IntervalTask intervalTask = new IntervalTask();

        System.out.println(intervalTask.solution(A, B));

    }
}
