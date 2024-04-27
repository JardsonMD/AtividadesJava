class LerRetangulo 
{
	public static void main(String[] args) throws Exception
	{
		Retangulo r1 = new Retangulo();
		System.out.println("Digite a base do retangulo: ");
		r1.base = JUtil.readFloat();
		while(r1.base != 0){
			System.out.println("Digite a altura: ");
			r1.altura = JUtil.readFloat();
			r1.mostrar();
			System.out.println("Digite a base do retangulo: ");
			r1.base = JUtil.readFloat();

		}//While
	}//Main
}//Class
