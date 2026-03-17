public class HelloName {
    public static void main(String[] args) {

        // If no command-line arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for loop to print greeting for each name
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }

    }
}