class Investimento 
{
	public static void main(String[] args) throws Exception{
		double p, r, a, aux;
		int n;
		System.out.println("Digite o investimento: ");
		p = JUtil.readDouble();
		System.out.println("Digite a taxa de juros (Em %): ");
		r = JUtil.readDouble();
		System.out.println("Digite o numero de anos: ");
		n = JUtil.readInt();

		for(int i=0; i<n; i++){
			System.out.println("Quantidade original investida: " + p + "\nTaxa de juros anual: " + r + "\nAno: " + (i+1));
			aux = 1 + (r/100);
			a = p * Math.pow(aux, (i+1));
			System.out.println("Quantidade em deposito: " + a);
			
		}
	}
}
