class CadastrarProd 
{
	public static void main(String[] args) throws Exception{
		Produto p1 = new Produto();
		float contCaro = 0, contBarato = 1000, contMaUni = 0, contMeUni = 1000, contMaVal = 0, contMeVal = 1000;
		String caro = "", barato = "", maisUni = "", menosUni = "", maisVali = "", menosVali = "";

		System.out.println("Digite o codigo do produto: ");
		p1.codigo = JUtil.readInt();
		while(p1.codigo != 0){
			System.out.println("Digite o nome do produto: ");
			p1.nome = JUtil.readString();
			System.out.println("Digite o valor unitario do produto: ");
			p1.valorUni = JUtil.readFloat();
			System.out.println("Digite a quantidade do produto: ");
			p1.quantidade = JUtil.readInt();
			System.out.println("Digite a unidade do produto: ");
			p1.unidade = JUtil.readString();
			if(contCaro < p1.valorUni){
				contCaro = p1.valorUni;
				caro = p1.nome + " - R$" + p1.valorUni;
			}
			if(p1.valorUni < contBarato){
				contBarato = p1.valorUni;
				barato = p1.nome + " - R$" + p1.valorUni;
			}
			if(contMaUni < p1.quantidade){
				contMaUni = p1.quantidade;
				maisUni = p1.nome + " - Quantidade: " + p1.quantidade + p1.unidade;
			}
			if(p1.quantidade < contMeUni){
				contMeUni = p1.quantidade;
				menosUni = p1.nome + " - Quantidade: " + p1.quantidade + p1.unidade;
			}
			if(contMaVal < p1.valorTotal()){
				contMaVal = p1.valorTotal;
				maisUni = p1.nome + " - Quantidade: " + p1.quantidade + p1.unidade;
			}
			if(p1.valorTotal() < contMeVal){
				contMeVal = p1.valorTotal;
				menosUni = p1.nome + " - Quantidade: " + p1.quantidade + p1.unidade;
			}
			
			
			System.out.println("Digite o codigo do produto: ");
			p1.codigo = JUtil.readInt();
		}//while

		System.out.println("Produto mais caro: " + caro);
		System.out.println("Produto mais barato: " + barato);
		System.out.println("Produto com mais unidades: " + maisUni);
		System.out.println("Produto com menos unidades: " + menosUni);


	}//Main
}//Class
