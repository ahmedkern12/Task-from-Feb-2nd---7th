public class Task2 {
    public static void main(String[] args) {

        
        String javaHome = System.getProperty("java.home");

        System.out.println("Java Home Path: " + javaHome);

        
        System.out.println("\n--- Java Environment Info ---");
        System.out.println("JVM: Executes compiled Java bytecode.");
        System.out.println("JRE: Provides JVM + standard libraries to run Java apps.");
        System.out.println("JDK: Includes JRE + development tools like javac for compilation.");

        System.out.println("\nIf this program compiled successfully, "
                + "JDK is installed on this machine.");
    }
}
