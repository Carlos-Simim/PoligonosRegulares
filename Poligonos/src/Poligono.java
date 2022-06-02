
public class Poligono {
	private double medidaLados;
	private double area;
	private double perimetro;
	private int quantLados;
	
	Poligono(int quantLados, double medidaLados){
		this.quantLados = quantLados;
		this.medidaLados = medidaLados;
	}
	
	void calcularPerimetro() {
		
		this.perimetro = this.medidaLados * this.quantLados;
	} 
	
	void calcularArea() {
		if(this.quantLados==3) {
		this.area = (this.medidaLados + this.medidaLados + this.medidaLados)/2;	
		}
		
		if(this.quantLados==4) {
			this.area = this.medidaLados * this.medidaLados;
		}
		
		
	}
	
	double getArea() {
		
		return this.area;
	}
	
	double getPerimetro() {
		
		return this.perimetro;
	}
	
	String getDescricao() {
		if(this.quantLados == 3) {
			return "Triangulo";
		}
		if(this.quantLados == 4) {
			return "Quadrado";
		}
		
		return "Poligono qualquer"; 
	}
	
}
