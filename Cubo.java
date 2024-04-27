class Cubo 
{
	public float aresta;

	public double area(){
	return 6 * (Math.pow(this.aresta, 2));
	}
	public double volume(){
	return Math.pow(this.aresta, 3);
	}
	public void mostrar(){
		System.out.println("Area: " + this.area());
		System.out.println("Volume: " + this.volume());
	}
}//Class
