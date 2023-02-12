import java.util.Scanner;

public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter a letter: ");
        char letter = sc.nextLine().charAt(0);
        int index = sentence.indexOf(letter);
        if (index == -1) {
            System.out.println("The letter does not exist in the sentence.");
        } else {
            System.out.println(sentence.substring(index + 1));
        }
    }
}