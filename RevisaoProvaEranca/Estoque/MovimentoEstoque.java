class MovimentoEstoque 
{
	public static void main(String[] args) throws Exception
	{
		ProdutoCustoAtual pca = new ProdutoCustoAtual(1, "Feijao", 60f, 1.5f);
		ProdutoCustoMedio pcm = new ProdutoCustoMedio(2, "Tomate", 120f, 2.5f);
		pca.mostrarDados();
		pcm.mostrarDados();
		pca.repor(100f, 1.6f);
		pcm.repor(100f, 2.6f);
		pca.mostrarDados();
		pcm.mostrarDados();
		pca.baixar(30);
		pcm.baixar(50);
		pca.mostrarDados();
		pcm.mostrarDados();
		pcm.baixar(300);
	}
}
