abstract class Empregado 
{
	private int matricula;
	private String nome;
	private float salarioBase;

	public Empregado(int mat, String nom, float sBase){
		this.matricula = mat;
		this.nome = nom;
		this.salarioBase = sBase;
	}

	public int getMatricula(){
		return this.matricula;
	}
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public float getSalarioBase(){
		return this.salarioBase;
	}
	public void setSalarioBase(float sBase){
		this.salarioBase = sBase;
	}

	public double salarioLiquido(){
		return this.salarioBase * (1 - 0.11);
	}

	public void mostrarDados(){
		System.out.println("Matricula\tNome\tSalario Base\n" + 
			getMatricula() + "\t" +
			getNome() + "\t" +
			getSalarioBase());
	}
}
