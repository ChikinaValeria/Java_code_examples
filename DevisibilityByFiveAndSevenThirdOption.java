public class DevisibilityByFiveAndSevenThirdOption {
    public static boolean isDevisibleByFiveAndSeven(int number) {
        boolean result = number % 5 == 0 && number % 7 == 0;
        return result;
    }

    public static void main(String[] args) {
        int[] testNumbers = {5, 12, 7, 35, 70, 0, -14, -105};
        for (int number : testNumbers) {
            boolean isDevisible = isDevisibleByFiveAndSeven(number);
            System.out.println("Your number " + number + " is " + (isDevisible ? "devisible by five and seven" : "not devisible by five and seven"));
        }
    }
}