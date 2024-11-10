package geometrica;

public class Retangulo {
	private double comp;
	private double altura;
	
	public Retangulo(double c, double a) {
		this.comp = c;
		this.altura = a;
	}
	
	public double getArea() {
		return comp * altura;
	}
	
	public double getPerimetro() {
		return 2 * (comp + altura);
	}
}
