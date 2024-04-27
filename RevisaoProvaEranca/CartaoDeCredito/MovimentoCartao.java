class MovimentoCartao 
{
	public static void main(String[] args) 
	{
		CartaoEspecial card = new CartaoEspecial(1, "Joao", 500f, 50f);
		card.mostrarDados();
		card.comprar(50f);
		card.mostrarDados();
		card.comprar(49f);
		card.mostrarDados();
		card.comprar(450f);
		card.mostrarDados();
		card.comprar(50f);
		card.mostrarDados();
		card.pagar(50f);
		card.mostrarDados();
		card.comprar(50f);
		card.mostrarDados();
		card.pagarTudo();
		card.mostrarDados();

	}
}
