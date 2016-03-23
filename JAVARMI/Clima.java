import java.io.Serializable;


public class Clima implements Serializable {
	private float temperatura;
	private String tiempo;
	
	public Clima(float temperatura, String tiempo) {
		super();
		this.temperatura = temperatura;
		this.tiempo = tiempo;
		
		//System.out.println(temperatura);
	}

	@Override
	public String toString() {
		return "Clima [temperatura=" + temperatura + ", tiempo=" + tiempo + "]";
	}
	
	
	
}
