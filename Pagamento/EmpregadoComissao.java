class EmpregadoComissao extends EmpregadoLei 
{
	private float comissao;

	public EmpregadoComissao(int mat, String nom, float sBase, float com){
		super(mat, nom, sBase);
		this.comissao = com;
	}

	public float getComissao(){
		return this.comissao;
	}
	public void setComissao(float com){
		this.comissao = com;
	}

	public double salarioLiquido(float vendas){
		return (super.salarioLiquido() + (vendas * (this.comissao/100)));
	}

	public void mostrarDados(){
		System.out.println("Matricula\tNome\tSalario Base\tComissao\n" + 
			super.getMatricula() + "\t" +
			super.getNome() + "\t" +
			super.getSalarioBase() + "\t" +
			this.getComissao());
	}
}
