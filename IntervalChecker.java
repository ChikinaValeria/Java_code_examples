import java.util.Arrays;
public class IntervalChecker{
    public static boolean doesIntBelongToInterval(int[] interval, int number){
        if (interval == null || interval.length == 0){
            return false;
        }
        if (number<interval[0]|| number>interval[interval.length-1]){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {10},
            {10},
            null
        };
        int[] numbers = {9, 10, 20, 21, -12, 15, 11, 10, 10};

        for (int i = 0; i < intervals.length; i++) {
            System.out.println("Number " + numbers[i] + (doesIntBelongToInterval(intervals[i], numbers[i])? " does belong to the interval" : " does not belong to the interval") + Arrays.toString(intervals[i]) );
        }
    }
}