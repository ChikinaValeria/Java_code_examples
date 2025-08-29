

public class GivenIntervalChecker{
    public static boolean doesIntBelongToInterval(int number){
        return number >= 10 && number <= 20;
    }

    public static void main (String[] args){
        int[] numbers = {9, 10, 20, 21, 15, -12};
        for (int num : numbers) {
            boolean belongs = doesIntBelongToInterval(num);
            System.out.println("Your number " + num + (belongs ? " belongs to the interval" : " doesn't belong to the interval"));
        }
        
    }
}