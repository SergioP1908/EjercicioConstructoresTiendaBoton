/*
 * Clase boton
	-color
	-tamaño
 	-forma
 * 
 */

public class Boton {

    private String color;

	private String tamanio;

	private String forma;

	public Boton(String color, String forma, String tamanio){
		this.color = color;

		this.forma = forma;

		this.tamanio = tamanio;
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	

}
