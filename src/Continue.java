public class Continue {
    public static void main (String[] args) {
        int i = 1; // Initialise loop counter outside the loop
        while (i <= 10) {
            if (i % 2 != 0) { // Checks if the number is odd
                i++; // Increment before continue to avoid infinite loop
                continue; // Skip the rest of the loop body
            }
            System.out.println(i); // This will only execute for even numbers
            i++; // Increment after printing to prepare for the next iteration
        }
    }
}
