import java.rmi.Naming;


public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServidorFunciones sf = (ServidorFunciones)Naming.lookup("ServidorFunciones");
		
		//System.out.println( sf.clima(3435907) );
		

		sf.agregar(524901, "Moscu");
		sf.agregar(3435907, "Buenos Aires");
		
		
		for( String str : sf.listado() ){
			System.out.println(str);
		}
		
	}

}
