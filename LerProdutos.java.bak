class LerProdutos {
	public static void main(String[] args) throws Exception{
		System.out.println("Digite a quantidade de produtos: ");
		Produto produtos[] = new Produto[JUtil.readInt()];
		double total = 0, contValioso = 0;
		String mValioso = "";
		
		for(int i = 0; i < produtos.length; i++){
			produtos[i] = new Produto();
			System.out.println("Digite o codigo do produto " + (i+1) + ": ");
			produtos[i].codigo = JUtil.readInt();
			System.out.println("Digite o nome do produto " + (i+1) + ": ");
			produtos[i].nome = JUtil.readString();
			System.out.println("Digite a quantidade do produto " + (i+1) + ": ");
			produtos[i].quantidade = JUtil.readInt();
			System.out.println("Digite a unidade do produto " + (i+1) + ": ");
			produtos[i].unidade = JUtil.readString();
			System.out.println("Digite o valor do produto " + (i+1) + ": ");
			produtos[i].valorUni = JUtil.readFloat();
			if(contValioso < produtos[i].valorTotal()){
				contValioso = produtos[i].valorTotal();
				mValioso = "O produto mais valioso e " + produtos[i].nome + " com R$ " + produtos[i].valorTotal();
			}//if
			total += produtos[i].valorTotal();

		}//forLeitura
		System.out.println("Codigo\tNome\tQuant\tUnid\tValor\tTotal");
		for(int i = 0; i < produtos.length; i++){
			System.out.println(produtos[i].codigo + "\t"  + 
				produtos[i].nome + "\t" + 
				produtos[i].quantidade + "\t"  + 
				produtos[i].unidade + "\t" + 
				produtos[i].valorUni + "\t" + 
				produtos[i].valorTotal());
			
		}//forMostrar
		System.out.println("Valor total dos produtos : " + total);
		System.out.println(mValioso);




	}//Main
}//Class
