

public class GivenIntervalChecker{
    public static boolean doesIntBelongToInterval(int number){
        if (number < 10 || number > 20){
            return false;
        } else {    
            return true;    
        }
    }

    public static void main (String[] args){
        int[] numbers = {9, 10, 20, 21, 15, -12};
        for (int num : numbers) {
            System.out.println("Your number " + num + (doesIntBelongToInterval(num) ? " belongs to the interval" : " doesn't belong to the interval"));
        }
        
    }
}