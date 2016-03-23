import java.io.Serializable;
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

	public Ciudad buscar(int id){
		return Ciudad.listado.get(id);
	}
	
	public Ciudad(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		
		Ciudad.listado.add(this);
		//Arrays.sort(listado.toArray());
		Collections.sort(Ciudad.listado);
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Ciudad carg = (Ciudad)arg0;
		return this.nombre.compareTo(carg.nombre);
	}
	
	
	
}
