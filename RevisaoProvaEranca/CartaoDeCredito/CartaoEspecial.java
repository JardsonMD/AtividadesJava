class CartaoEspecial extends Cartao
{
	private float minimo;
	public CartaoEspecial(int numero, String nome, float limite, float minimo){
		super(numero, nome, limite);
		this.minimo = minimo;
	}

	// G/S's
	float getMinimo(){
		return this.minimo;
	}
	void setMinimo(float minimo){
		this.minimo = minimo;
	}

	// overrite
	public void comprar(float valor){
		if(valor <= this.minimo){
			super.comprar(valor);
		}else{
			System.out.println("Valor minimo de compra: " + this.minimo);
		}
	}
	public void mostrarDados(){
		System.out.println(super.getNumero() + "\t" + 
			super.getNome() + "\tR$" +
			super.getLimite() + "\tR$" +
			super.getSaldo() + "\tR$" + 
			this.minimo);
	}

	// Metodos
	public void pagarTudo(){
		super.pagar(super.getSaldo());
	}
}
