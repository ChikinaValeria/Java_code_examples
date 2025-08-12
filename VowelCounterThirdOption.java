import java.util.Scanner;
import java.util.Set;

public class VowelCounterThirdOption{
    

    public static int countVowels(String text){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        System.out.println("Enter your phrase!");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        System.out.println("The number of vowels is: " + countVowels(phrase));
        scan.close();
        
        
    }
}