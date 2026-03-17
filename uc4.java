public class HelloName {
    public static void main(String[] args) {

        // If no names are provided
        if (args.length == 0) {
            System.out.println("Hello World");
        } 
        else {
            // Loop through all provided names
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i]);
            }
        }

    }
}