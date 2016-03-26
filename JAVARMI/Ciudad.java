import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Ciudad implements Comparable, Serializable{
	public static ArrayList<Ciudad> listado = new ArrayList<Ciudad>();
	
	public int codigo;
	public String nombre;
	
	
	
	@Override
	public String toString() {
		return "Ciudad [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

	public static Ciudad buscar(int id){
		return Ciudad.listado.get(id);
	}
	
	public static ArrayList<String> getListado()
	{
		// TODO Auto-generated method stub
		ArrayList<String> astr = new ArrayList<String>();
		
		for( int c = 0; c < Ciudad.listado.size(); c++ )
			astr.add( Ciudad.listado.get(c).toString() );
		
		return astr;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Ciudad))
			return false;
		Ciudad other = (Ciudad) obj;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public Ciudad(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		
		if(!Ciudad.listado.contains(this)){
			Ciudad.listado.add(this);
			//Arrays.sort(listado.toArray());
			Collections.sort(Ciudad.listado);
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Ciudad carg = (Ciudad)arg0;
		return this.nombre.compareTo(carg.nombre);
	}
	
	
	
}
