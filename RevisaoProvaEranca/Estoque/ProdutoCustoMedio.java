class ProdutoCustoMedio extends Produto 
{
	ProdutoCustoMedio(int codigo, String nome, float quantidade, float custo){
	super(codigo, nome, quantidade, custo);
	}
	void repor(float quant, float custo){
		super.setCusto(((super.getQuantidade() * super.getCusto())+(quant*custo))/(super.getQuantidade()+quant));
		super.repor(quant, custo);
	}
}
