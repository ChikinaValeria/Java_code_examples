import java.util.Scanner;
public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    public static void main(String[] args) {
        System.out.println("Enter a phrase to check if it's a palindrome:");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        if (isPalindrome(phrase)) {
            System.out.println("The phrase is a palindrome.");
        } else {
            System.out.println("The phrase is not a palindrome.");
        }
        scan.close();
    }
}







