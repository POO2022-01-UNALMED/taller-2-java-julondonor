package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		return asientos.length;
	}
	public String verificarIntegridad(){
		for (Asiento asiento : asientos) {
			if(asiento.registro != this.registro) {
				return "Las piezas no son originales";
			}
		}
		if(motor.registro != this.registro) {
			return "Las piezas no son originales";
		} else {
			return "Auto original";
		}
		
	}
}
