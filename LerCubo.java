class LerCubo 
{
	public static void main(String[] args) throws Exception
	{
		Cubo c1 = new Cubo();
		System.out.println("Digite a aresta do cubo: ");
		c1.aresta = JUtil.readFloat();
		while(c1.aresta != 0){
			c1.mostrar();
			System.out.println("Digite a aresta do cubo: ");
			c1.aresta = JUtil.readFloat();
		}
	}//Main
}//Class
