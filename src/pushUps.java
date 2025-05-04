import java.util.Scanner;

public class pushUps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many push-ups do you want to do? " );
        int target = input.nextInt();



        for (int i = 1; i <= target; i++) {
            System.out.println("Doing push-up " + i + " out of " + target);

        }

    }

}
