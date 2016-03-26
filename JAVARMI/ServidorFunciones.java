import java.rmi.Remote;
import java.rmi.RemoteException;

import java.util.ArrayList;

public interface ServidorFunciones extends Remote {
	
	void agregar(int id, String nombre) throws RemoteException;
	
	ArrayList<String> listado() throws RemoteException;
	
	Clima getClima(int id) throws RemoteException;
	
}
