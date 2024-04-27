class abstract Cartao 
{
	private int numero;
	private String nome;
	private float limite, saldo;
	
	// Construtor
	public Cartao(int numero, String nome, float limite){
		this.numero = numero;
		this.nome = nome;
		this.limite = limite;
		this.saldo = 0;
	}

	// G/S's
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public float getLimite(){
		return this.limite;
	}
	public void setLimite(float limite){
		this.limite = limite;
	}
	public float getSaldo(){
		return this.saldo;
	}
	
	// Metodos
	public boolean autorizar(float valor){
		return (valor + saldo <= limite);
	}	
	public void comprar(float valor){
		if(autorizar(valor)){
			this.saldo = this.saldo + valor;
		}else{
			System.out.println("Compra nao autorizada!");
		}
	}
	public void pagar(float valor){
		this.saldo = this.saldo - valor;
	}
	public void mostrarDados(){
		System.out.println(this.numero + "\t" + 
			this.nome + "\tR$" + 
			this.limite + "\tR$" + 
			this.saldo);
	}
}
