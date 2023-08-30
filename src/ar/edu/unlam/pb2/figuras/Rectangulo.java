package ar.edu.unlam.pb2.figuras;
	
public class Rectangulo {
	private Double base;
	private Double altura;
	
	public Rectangulo (Double base, Double altura) {
		this.base= base;
		this.altura= altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

	
	public Double getPerimetro() {
		return this.base *2 + this.altura * 2;
	}
}