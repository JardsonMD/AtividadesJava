class Candidato
{
	int numero, votos;
	String nome;

	public boolean classificado(int minimo){
		return this.votos >= minimo;
	}
	public boolean classificado(){
		return this.votos >= 10;
	}
	public void mostrarDados(){
		System.out.print("\t" + this.numero + "\t" + this.nome + "\t" + this.votos);
	}

}//Class
