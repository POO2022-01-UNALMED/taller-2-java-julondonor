package test;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	public void cambiarColor(String color) {
		String[] colores = {"rojo","verde", "amarillo","negro", "blanco"};
		for (int i=0; i<5; i++) {
			if(color.equals(colores[i])) {
				this.color = color;
			}
		}
	}

}
