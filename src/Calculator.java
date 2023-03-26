// step 1 : making interface

import java.rmi.*;

public interface Calculator extends Remote {
    int multiply(int a, int b) throws RemoteException;
}