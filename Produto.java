class Produto 
{
	public int codigo, quantidade;
	public float valorUni;
	public String nome, unidade;
	public double valorTotal(){
		return this.valorUni * this.quantidade;	
	}
}//Class
