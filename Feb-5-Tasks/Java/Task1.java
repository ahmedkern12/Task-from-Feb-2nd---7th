public class Task1{
    public static void main(String[] args) {

        
        String javaVersion = System.getProperty("java.version");
        String jvmVendor = System.getProperty("java.vm.vendor");

        
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");

        System.out.println("Java Version: " + javaVersion);
        System.out.println("JVM Vendor: " + jvmVendor);
        System.out.println("Operating System: " + osName);
        System.out.println("OS Architecture: " + osArch);
    }
}
