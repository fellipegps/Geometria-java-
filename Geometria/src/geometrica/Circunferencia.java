package geometrica;

public class Circunferencia {
	private double raio;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		return Math.PI * raio * raio;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * raio;
	}
}
