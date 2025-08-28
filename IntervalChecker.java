public class IntervalChecker{
    public static boolean doesIntBelongToInterval(int[] interval, int number){
        if (number<interval[0]|| number>interval[interval.length-1]){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        boolean result = doesIntBelongToInterval(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 9);
        boolean result2 = doesIntBelongToInterval(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 10);
        boolean result3 = doesIntBelongToInterval(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 20);
        boolean result4 = doesIntBelongToInterval(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 21);
        boolean result5 = doesIntBelongToInterval(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, -12);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}