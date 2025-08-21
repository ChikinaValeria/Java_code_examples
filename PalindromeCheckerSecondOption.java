import java.util.Scanner;
public class PalindromeCheckerSecondOption {

    public static boolean isPalindrome(String text) {
        String clearText = text.toLowerCase().strip().replaceAll("[^a-z0-9]", "");
        String reversedText = new StringBuilder(clearText).reverse().toString();
        return clearText.equals(reversedText);      
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("No lemon, no melon"));

        System.out.println("Enter a string of text to check whether it is palindrome or not!");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
        scan.close();
    }
}