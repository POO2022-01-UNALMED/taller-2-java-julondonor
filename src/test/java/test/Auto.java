package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos = new Asiento[10];
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int count = 0;
		for(Asiento asiento: asientos) {
			if (asiento instanceof Asiento) {
				count++;
			}
		}
		return count;
	}
	public String verificarIntegridad(){
		for (Asiento asiento : asientos) {
			if(asiento instanceof Asiento) {
			if(asiento.registro != this.registro) {
				return "Las piezas no son originales";
			}}
		}
		if(motor.registro != this.registro) {
			return "Las piezas no son originales";
		} else {
			return "Auto original";
		}
		
	}
}
