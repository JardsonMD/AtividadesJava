class LerRetangulos 
{
	public static void main(String[] args) throws Exception {
		float sArea = 0, sPerimetro = 0;
		double mArea = 0;
		int nret = 0;
		System.out.println("Digite o numero de retangulos: ");
		Retangulo retangulos[] = new Retangulo[JUtil.readInt()];
		for(int i = 0; i < retangulos.length; i++){
			retangulos[i] = new Retangulo();
			System.out.println("Digite a base do retangulo: ");
			retangulos[i].base = JUtil.readFloat();
			System.out.println("Digite a altura do retangulo: ");
			retangulos[i].altura = JUtil.readFloat();
			sArea += retangulos[i].area();
			sPerimetro += retangulos[i].perimetro();
			if(mArea < retangulos[i].area()){
				mArea = retangulos[i].area();
				nret = i+1;
			}
		}//For 1
		System.out.println("Item\tBase\tAltura\tArea\tPerimetro");
		for(int i = 0; i < retangulos.length; i++){
			System.out.println((i+1) + "\t" +
				retangulos[i].base + "\t" +
				retangulos[i].altura + "\t" +
				retangulos[i].area() + "\t" +
				retangulos[i].perimetro());
		}//For 2
		System.out.println("\t\t\t" + sArea + "\t" + sPerimetro);
		System.out.println("A maior area eh " + mArea + " do retangulo " + nret);

	}//Main
}//Class
