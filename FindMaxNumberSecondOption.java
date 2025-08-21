public class FindMaxNumberSecondOption{
    public static void main(String[] args) {
           
    }
    
    public static int findMaxNumber(int[] arr){
        if (arr == null || arr.length == 0) {
            //unchecked exeption, parent - RuntimeExeption
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}