public class HelloName {
    public static void main(String[] args) {

        // If no arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Join all names with comma and space
            String result = String.join(", ", args);

            // Print final output
            System.out.println("Hello, " + result + "!");
        }
    }
}