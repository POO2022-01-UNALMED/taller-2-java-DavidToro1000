package test;
public class Auto {
    String modelo;
    int precio;
    Asiento asientos[];
    String marca;
    Motor motor;
    int registro;
    public static int cantidadCreados;
    int cantidadAsientos() {
    	return(asientos.length);
    }
    String verificarIntegridad() {
    	if (motor.registro!=registro)
    		return("Las piezas no son originales");
    	for (Asiento a:asientos) {
    		if (a.registro!=registro)
    			return("Las piezas no son originales");
    	}
    	 return("Auto original");
    }
    
}
