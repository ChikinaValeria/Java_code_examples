
public class DevisibilityByFiveAndSeven {
    public static boolean isDevisibleByFiveAndSeven (int number){
        boolean result = (number % 5 == 0)? ((number % 7 ==0)? true: false): false;
        return result;
    }


    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
        //int myNumber = Integer.parseInt(scan.nextLine());
        boolean isDevisible = isDevisibleByFiveAndSeven(5);
        System.out.println("Your number is " + (isDevisible == true? "devisible by five and seven": "not devisible by five and seven"));
        isDevisible = isDevisibleByFiveAndSeven(12);
        System.out.println("Your number is " + (isDevisible == true? "devisible by five and seven": "not devisible by five and seven"));
        isDevisible = isDevisibleByFiveAndSeven(7);
        System.out.println("Your number is " + (isDevisible == true? "devisible by five and seven": "not devisible by five and seven"));
        isDevisible = isDevisibleByFiveAndSeven(35);
        System.out.println("Your number is " + (isDevisible == true? "devisible by five and seven": "not devisible by five and seven"));
        isDevisible = isDevisibleByFiveAndSeven(70);
        System.out.println("Your number is " + (isDevisible == true? "devisible by five and seven": "not devisible by five and seven"));

    }
}    