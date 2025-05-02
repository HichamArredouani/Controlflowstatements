import java.util.Scanner;

public class examScore {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your examscore (0-100): ");
        int score = input.nextInt();

        if (score > 50) {
                System.out.println("Gebuisd!!!!!!");
        } else {
            System.out.println("Geslaagd!!!!!");
        }
    }
}
