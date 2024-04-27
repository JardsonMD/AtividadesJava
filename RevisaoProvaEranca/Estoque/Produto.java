abstract class Produto 
{
	private int codigo;
	private String nome;
	private float custo, quantidade;
	
	Produto(int codigo, String nome, float quantidade, float custo){
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.nome = nome;
		this.custo = custo;
	}
	// G/S Codigo
	int getCodigo(){
		return this.codigo;
	}
	void setCodigo(int codigo){
		this.codigo = codigo;
	}
	// G/S Nome
	String getNome(){
		return this.nome;
	}
	void setNome(String nome){
		this.nome = nome;
	}
	// G Quantidade
	float getQuantidade(){
		return this.quantidade;
	}
	// G/S Custo
	float getCusto(){
		return this.custo;
	}
	void setCusto(float custo){
		this.custo = custo;
	}

	float getValorEstoque(){
		return (this.quantidade * this.custo);
	}

	void repor(float quant, float custo){
		this.quantidade += quant;
	}

	boolean validarSaldo(float quant){
		return (this.quantidade >= quant);
	}

	void baixar(float quant){
		if(validarSaldo(quant)){
			this.quantidade -= quant;
		}else{
		System.out.println("Operacao nao pode ser efetuada!");
		}
	}

	void mostrarDados(){
		System.out.println("Codigo\tNome\tQuantidade\tCusto\tValorDeEstoque");
		System.out.println(this.getCodigo() + "\t" +
			this.getNome() + "\t" +
			this.getQuantidade() + "\t" +
			this.getCusto() + "\t" +
			this.getValorEstoque());
	}

}
