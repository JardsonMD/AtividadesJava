class Aluno
{
	int codigo;
	String nome;
	float nota1, nota2, nota3;

	public float media(){
		return (this.nota1 + this.nota2 + this.nota3)/3;
	}
	public float media(float p1, float p2, float p3){
		return (this.nota1 * p1 + this.nota2 * p2 + this.nota3 * p3)/(p1 + p2 + p3);
	}
	
	
}//Class