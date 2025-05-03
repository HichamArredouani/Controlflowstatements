import java.util.Scanner;

public class pushUptarget {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many push ups do you want to do?");
        int target = input.nextInt();


        int i = 1;
        while (i  <= target) {
            System.out.println("Doing push-up " + i + " out of " + target);
            i++;
        }

        System.out.println("Well done! ");


    }
}
