import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("SERVER INICIADO");
		
		try{
			LocateRegistry.createRegistry(1099);

			ServidorFuncionesImplementado sfi = new ServidorFuncionesImplementado();

			Naming.rebind("ServidorFunciones", sfi);
		}
		catch(RemoteException re){
			re.printStackTrace();
			System.out.println("NO SE PUDO CREAR");
		}
		
		
	}

}
