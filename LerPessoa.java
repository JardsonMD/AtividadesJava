class LerPessoa 
{
	public static void main(String[] args) throws Exception
	{
		Pessoa p = new Pessoa();
		System.out.println("Dados da pessoa");
		System.out.println("Digite seu ano de nascimento: ");
		p.anoNascimento = JUtil.readInt();
		System.out.println("Idade: " + p.idade());

	}
}
