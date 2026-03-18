public class HelloApp {
    public static void main(String[] args) {
        // Default name
        String name = "World";
        
        // Check if names are provided as command-line arguments
        if (args.length > 0) {
            // Code Snippet for HelloApp UC4:
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString(); // Use the provided names
        }
        
        System.out.println("Hello, " + name + "!");
    }
}