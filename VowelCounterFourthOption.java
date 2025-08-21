import java.util.Scanner;

public class VowelCounterFourthOption{
    

public static long countVowels(String text) {
    String vowels = "aeiou";
    return text.toLowerCase()
               .chars()
               .filter(c -> vowels.indexOf(c) != -1)
               .count();
}


    public static void main(String[] args){
        System.out.println("Enter your phrase!");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        System.out.println("The number of vowels is: " + countVowels(phrase));
        scan.close();
        
        
    }
}