import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean wantsToContinue = true;
        while (wantsToContinue) {
            System.out.println("Main Menu:");
            System.out.println("1. Products");
            System.out.println("2. Services");
            System.out.println("3. About Us");
            System.out.println("4. Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Navigating to Products Menu...");
                    // Simulate additional logic or print statements for this menu
                    System.out.println("Here you can browse our products.");
                }
                case 2 -> {
                    System.out.println("Navigating to Services Menu...");
                    // Simulate additional logic or print statements for this menu
                    System.out.println("Explore our services offered.");
                }
                case 3 -> {
                    System.out.println("Loading About Us Page...");
                    // Simulate additional logic or print statements for this page
                    System.out.println("Learn more about our company.");
                }
                case 4 -> {
                    System.out.println("Opening Contact Page...");
                    // Simulate additional logic or print statements for this page
                    System.out.println("Contact us for more information.");
                }
                case 5 -> {
                    System.out.println("Exiting... Thank you for visiting!");
                    wantsToContinue = false;
                }
                default -> System.out.println("Invalid choice, please enter a number between 1-5.");
            }
        }
    }
}
