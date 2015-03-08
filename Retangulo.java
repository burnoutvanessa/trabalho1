public class Retangulo{
	public double base;
	public double altura;
	
	public void area(){
		System.out.println("A area do retangulo e: "+ this.base * this.altura);
	}
	public void perimetro(){
		System.out.println("O perimetro do retangulo e: "+ 2*(this.base + this.altura));
	}
}  
