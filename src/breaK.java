public class breaK {
    public static void main (String[] args) {
        int counter = 1;
        while (true) { // Potential infinite loop
            if (counter > 5) {
                break; // Exits the loop
            }
            System.out.println("Count is: " + counter);
            counter++;
        }
    }
}
