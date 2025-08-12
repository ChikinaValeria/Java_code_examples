import java.util.Scanner;

public class VowelCounterSecondOption{
    

    public static int countVowels(String text){
        String vowels = "aeiou";
        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i <= text.length()-1; i++){
            if (vowels.indexOf(text.charAt(i)) != -1){
                count+=1;
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