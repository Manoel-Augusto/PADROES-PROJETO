package factorymethod;

public class Main {
	public static void main(String[] args) {
		
		Triangulo t = new Triangulo();
		
	
		t.setLado1(9);
		t.CalcularTipoDeFigura();
		System.out.println("1 alteração"+t);
		System.out.println(t.getTipoFigura());
		
		t.setLado2(7);
		t.CalcularTipoDeFigura();
		System.out.println("2 alteração"+t);
		System.out.println(t.getTipoFigura());
		
		
		t.setLado3(8);
		t.CalcularTipoDeFigura();
		System.out.println("3 alteração"+t);
		System.out.println(t.getTipoFigura());
	
	}
}
