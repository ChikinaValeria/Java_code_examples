public class FindMaxNumber {
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

    public static void main(String[] args){
        int[] arr1 = {1};
        int[] arr2 = {};
        int[] arr3 = {2, 2, 2};
        int[] arr4 = {-3, -5, -18};
        int[] arr5 = {78, 5, 9087, 234};
        try {
            System.out.println("The maximum number is: "+ findMaxNumber(arr1));
            System.out.println("The maximum number is: "+ findMaxNumber(arr5));
            System.out.println("The maximum number is: "+ findMaxNumber(arr3));
            System.out.println("The maximum number is: "+ findMaxNumber(arr4));
            System.out.println("The maximum number is: "+ findMaxNumber(arr2));;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

