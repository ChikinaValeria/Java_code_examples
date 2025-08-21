public class FindMaxNumberSecondOption{
    public static void main(String[] args) {
           
    }

    public static int findMaxNumber(int[] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}