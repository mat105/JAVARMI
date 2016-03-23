import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class ServidorFuncionesImplementado extends UnicastRemoteObject implements ServidorFunciones {
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
		ArrayList<String> astr = new ArrayList<String>();
		
		for( int c = 0; c < Ciudad.listado.size(); c++ )
			astr.add( Ciudad.listado.get(c).toString() );
		
		return astr;
	}



	@Override
	public Clima clima(int id) throws RemoteException {
		// TODO Auto-generated method stub
		Clima climita = this.contacto.getClima(id);
	
		return climita;
}


	public ServidorFuncionesImplementado() throws RemoteException{
		this.contacto = new Contactador();
	}
}
