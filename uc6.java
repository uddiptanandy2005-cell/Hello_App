public class HelloName {
    public static void main(String[] args) {

        // If no arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder result = new StringBuilder();

            // Enhanced for loop to build string
            for (String name : args) {
                result.append(name).append(", ");
            }

            // Remove trailing comma and space safely
            if (result.length() >= 2) {
                result.setLength(result.length() - 2);
            }

            // Print final output
            System.out.println("Hello, " + result + "!");
        }
    }
}