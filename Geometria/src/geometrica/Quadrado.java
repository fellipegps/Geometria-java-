package geometrica;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		return lado * lado;
	}
	
	public double getPerimetro() {
		return 4 * lado;
	}
	
	public String getCor() {
		return "Azul";
	}
}
