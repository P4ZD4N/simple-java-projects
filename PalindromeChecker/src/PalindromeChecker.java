import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner palindrome = new Scanner(System.in);
        StringBuilder lastPartReverseBuilder = new StringBuilder();
        System.out.print("Enter word: ");

        String userWord = palindrome.nextLine();
        String firstPart;
        String lastPart;

        if (userWord.length() % 2 == 0) {
            firstPart = userWord.substring(0, (userWord.length() / 2));
            lastPart = userWord.substring((userWord.length() / 2), userWord.length());
        } else {
            firstPart = userWord.substring(0, (userWord.length() / 2));
            lastPart = userWord.substring((userWord.length() / 2)+1, userWord.length());
        }

        lastPartReverseBuilder.append(lastPart).reverse();
        String lastPartReverse = lastPartReverseBuilder.toString();

        if (firstPart.equalsIgnoreCase(lastPartReverse)) {
            System.out.println("The word '" + userWord + "' is a palindrome!");
        } else {
            System.out.println("The word '" + userWord + "' is not a palindrome!");
        }

    }
}