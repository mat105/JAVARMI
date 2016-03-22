import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("SERVER INICIADO");
		
		(new Contactador()).getClima(3435907);
		
		/*try{
			LocateRegistry.createRegistry(1099);
			System.out.println("REGISTRO CREADO");
		}
		catch(RemoteException re){
			System.out.println("NO SE PUDO CREAR");
		}*/
		
		
		
	}

}
