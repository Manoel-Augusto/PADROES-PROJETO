package factorymethod;

public class Triangulo implements FiguraGeometricaBidimensional {

	private float lado1;
	private float lado2;
	private float lado3;
	private String tipo = "Não calculado";

	private boolean condicaoExistencia(float a, float b, float c) {
		return Math.abs(b - c) < a && a < b + c;
	}

	public Triangulo() {
		this.lado1 = 1;
		this.lado2 = 1;
		this.lado3 = 1;
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		if (condicaoExistencia(lado1, lado2, lado3)) {
			this.lado1 = lado1;
		}
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}
	public void CalcularTipoDeFigura(){

		
		if (lado1 == lado2 && lado2 == lado3) {
			tipo = "Triângulo equilátero";
			
		} else if (lado1 != lado2 && lado2 != lado3) {
			tipo = "Triângulo escaleno";

		} else
			tipo = "Triângulo isósceles";
				
	}

	@Override
	public String getTipoFigura() {
		return tipo;
	}

	@Override
	public String toString() {
		return "[" + lado1 + ":" + lado2 + ":" + lado3 + "]";
	}
}
