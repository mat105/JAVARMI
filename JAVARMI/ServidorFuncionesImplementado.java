import java.rmi.RemoteException;
import java.util.ArrayList;


public class ServidorFuncionesImplementado implements ServidorFunciones {
	private static final long serialVersionUID = -231512405473655756L;
	
	private Contactador contacto;
	
	@Override
	public void agregar(int id, String nombre) throws RemoteException {
		// TODO Auto-generated method stub
		new Ciudad(id, nombre);
	}
	
	

	@Override
	public ArrayList<String> listado() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public float clima() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}



	public ServidorFuncionesImplementado() throws RemoteException{
		this.contacto = new Contactador();
	}
}
