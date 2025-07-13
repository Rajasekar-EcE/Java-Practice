import java.util.Scanner;
public class P12_FindVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine().toLowerCase();
        
        int vowelsCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelsCount++;
            } else if (letter >= 'a' && letter <= 'z') {  // Count only alphabetic consonants
                consonantCount++;
            }
        }

        System.out.println("The number of vowels is: " + vowelsCount);
        System.out.println("The number of consonants is: " + consonantCount);
        scan.close();
    }        
}