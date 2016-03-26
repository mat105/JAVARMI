import java.rmi.Naming;


public class Cliente {

	/**
	 * @param args
	 */
	public ServidorFunciones sf;
	
	
	public void correr() throws Exception{
		sf.agregar(524901, "Moscu");
		sf.agregar(3435907, "Buenos Aires");
		
		
		for( String str : sf.listado() ){
			System.out.println(str);
		}
	}
	
	public Cliente() throws Exception{
		sf = (ServidorFunciones)Naming.lookup("ServidorFunciones");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Cliente ncliente = new Cliente();
		ncliente.correr();
	}

}
