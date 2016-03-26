import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class ServidorFuncionesImplementado extends UnicastRemoteObject implements ServidorFunciones {
	private static final long serialVersionUID = -231512405473655756L;
	
	private Contactador contacto;
	
	@Override
	public void agregar(int id, String nombre) throws RemoteException {
		new Ciudad(id, nombre);
	}
	
	

	@Override
	public ArrayList<String> listado() throws RemoteException {
		return Ciudad.getListado();
	}



	@Override
	public Clima getClima(int id) throws RemoteException {
		Clima climita = this.contacto.getClima(id);
	
		return climita;
}


	public ServidorFuncionesImplementado() throws RemoteException{
		this.contacto = new Contactador();
	}
}
