import java.util.Scanner;

public class VowelCounter{
    

    public static int countVowels(String text){
        String vowels = "aeiou";
        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i <= text.length()-1; i++){
            for (int j = 0; j <= vowels.length()-1; j++){
                if (text.charAt(i) == vowels.charAt(j)){
                    count+=1;
                    break;
                }
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