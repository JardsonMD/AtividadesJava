class ProdutoCustoAtual extends Produto
{
	ProdutoCustoAtual(int codigo, String nome, float quantidade, float custo){
	super(codigo, nome, quantidade, custo);
	}
	void repor(float quant, float custo){
		super.setCusto(custo);
		super.repor(quant, custo);
	}
}
