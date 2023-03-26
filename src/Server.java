import java.rmi.*;
import java.rmi.registry.*;

class Server {
    public static void main(String[] args) {

        // making object of CalcRemote
        try {
            CalcRemote obj = new CalcRemote();

            // listening to that port and binding the method and object to the port
            Registry reg = LocateRegistry.createRegistry(9000);
            reg.bind("multiply", obj);
            System.out.println("Server is Walking");
        } catch (Exception e) {
            //
        }
    }
}