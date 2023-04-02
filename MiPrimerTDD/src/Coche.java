
public class Coche {

	public int velocidad;
	
	  public void acelerar_Alba_Melgar(int aceleracion) {
		  velocidad += aceleracion;

	    }

	public void decelerar_Alba_Melgar(int deceleracion) {
		velocidad -= deceleracion;
		if(velocidad < 0) velocidad = 0;
	}
	 

}
