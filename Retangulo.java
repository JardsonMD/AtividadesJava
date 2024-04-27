class Retangulo 
{
	public float base, altura;

	public double area(){
		return this.base * this.altura;
	}
	public double perimetro(){
		return 2 * (this.base + this.altura);
	}
	public void mostrar(){
		System.out.println("Area: " + this.area());
		System.out.println("Perimetro: " + this.perimetro());
	}


}//Class
