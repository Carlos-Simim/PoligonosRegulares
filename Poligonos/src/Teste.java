
public class Teste {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(3,2);
		Quadrado q1 = new Quadrado(4,2);
		Poligono p1 = new Poligono(6,2);
		
		t1.calcularArea();
		t1.calcularPerimetro();
		q1.calcularArea();
		q1.calcularPerimetro();
		p1.calcularPerimetro();
		
		System.out.println("Área do " + t1.getDescricao() + ": "  + t1.getArea());
		System.out.println("Perímetro do " + t1.getDescricao() + ": " + t1.getPerimetro());
		
		System.out.println("\nÁrea do do " + q1.getDescricao() + ": "  + q1.getArea());
		System.out.println("Perímetro do " + q1.getDescricao() + ": " + q1.getPerimetro());
		
		System.out.println("\nPerímetro do " + p1.getDescricao() + ": " + p1.getPerimetro());

	}

}
