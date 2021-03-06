import java.rmi.Naming;

public class FileServer {
    public static void main(String argv[]) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            FileInterface fi = new FileImpl("FileServer");
            Naming.rebind("//127.0.0.1/FileServer", fi);
        } catch (Exception e) {
            System.out.println("FileServer: " + e.getMessage());
            e.printStackTrace();
        }
    }
}