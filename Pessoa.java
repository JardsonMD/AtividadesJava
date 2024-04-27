class Pessoa{
	String nome, cor;
	float altura, peso;
	char sexo;
	int anoNascimento;
	
	public int idade(){
		return 2023 - anoNascimento;
	}
}
