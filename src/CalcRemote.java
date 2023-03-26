// implementing the interface Calculator()

import java.rmi.*;
import java.rmi.server.*;

public class CalcRemote extends UnicastRemoteObject implements Calculator {

    // constructor of CalcRemote
    public CalcRemote() throws RemoteException {

        // calling unicastremoteobject constructor
        super();
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
        return (a * b);
    }

}
