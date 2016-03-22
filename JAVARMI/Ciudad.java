import java.util.TreeMap;


public class Ciudad {
	private static TreeMap<Number, Ciudad> listado;
	
	private int codigo;
	private String nombre;
	
	
	
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
		
		Ciudad.listado.put(codigo, this);
	}
	
}
