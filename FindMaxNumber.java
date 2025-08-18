public class FindMaxNumber {
    public static int findMaxNumber(int[] arr){
        int max = -2147483648;
        for (int i=0; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args){
        int[] arr1 = {1};
        int[] arr2 = {};
        int[] arr3 = {2, 2, 2};
        int[] arr4 = {-3, -5, -18};
        int[] arr5 = {78, 5, 9087, 234};

        System.out.println("The maximum number is: "+ findMaxNumber(arr1));
        System.out.println("The maximum number is: "+ findMaxNumber(arr2));
        System.out.println("The maximum number is: "+ findMaxNumber(arr3));
        System.out.println("The maximum number is: "+ findMaxNumber(arr4));
        System.out.println("The maximum number is: "+ findMaxNumber(arr5));
    }
}

