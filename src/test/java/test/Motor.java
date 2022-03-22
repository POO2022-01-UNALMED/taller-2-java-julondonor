package test;

public class Motor {
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	public void asignarTipo(String tipo) {
		String[] tipos = {"electrico","gasolina"};
		for(int i=0;i<2;i++) {
			if(tipo.equals(tipos[i])) {
				this.tipo = tipo;
			}
		}
	}
}
