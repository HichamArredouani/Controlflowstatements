import java.util.Scanner;

public class letterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a new word: ");
            String word = input.nextLine();

            if (word.equalsIgnoreCase("Stop")) {
                break;
            }

            int length = word.length();

            System.out.println("That word has " + length + " letters.");

        }

        System.out.println("The program ends.");


    }
}
