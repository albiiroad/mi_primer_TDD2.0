import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TDDPC {

	@Test
	void  test_al_crear_un_coche_su_velocidad_es_cero() {
		Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	 @Test
	    public void test_al_acelerar_un_coche_su_velocidad_aumenta(){
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.acelerar_Alba_Melgar(30);
	        Assertions.assertEquals(30, nuevoCoche.velocidad);
	    }
	 
	 @Test
	    public void test_al_decelerar_un_coche_su_velocidad_disminuye(){
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.velocidad = 50;
	        nuevoCoche.decelerar_Alba_Melgar(20);
	        Assertions.assertEquals(30, nuevoCoche.velocidad);
	    }
	 
	 @Test
	    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero(){
	        Coche nuevoCoche = new Coche();
	        nuevoCoche.velocidad = 50;
	        nuevoCoche.decelerar_Alba_Melgar(80);
	        Assertions.assertEquals(0, nuevoCoche.velocidad);
	    }
}
