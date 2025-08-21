import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeCheckerThirdOption{

    public static boolean isPalindrome(String text) {
        String clearText = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        int len = clearText.length();
        
        // Сравниваем символы с начала и с конца в одном потоке
        return IntStream.range(0, len / 2)
                        .allMatch(i -> clearText.charAt(i) == clearText.charAt(len - 1 - i));
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