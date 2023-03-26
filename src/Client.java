import java.rmi.*;
import java.rmi.registry.*;

class Client {
    public static void main(String[] args) {
        // lookup for reg

        try {
            Registry reg = LocateRegistry.getRegistry(9000);
            Calculator obj = (Calculator) reg.lookup("multiply"); //look for method
            int value = obj.multiply(9, 9);
            System.out.println(value);
        } catch (Exception e) {
            //
        }
    }
}