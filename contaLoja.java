class contaLoja 
{
	public static void main(String[] args) throws Exception
	{
		String nConta, nome;
		float saldoIni, totalCob, totalPag, limite, novoSaldo;
		System.out.println("Digite o numero da conta: ");
		nConta = JUtil.readString();
		System.out.println("Digite o nome: ");
		nome = JUtil.readString();
		System.out.println("Digite o saldo do inicio do mes: ");
		saldoIni = JUtil.readFloat();
		System.out.println("Digite o total dos itens cobrados no mes: ");
		totalCob = JUtil.readFloat();
		System.out.println("Digite o total de pagamentos efetuados: ");
		totalPag = JUtil.readFloat();
		System.out.println("Digite o limite autorizado de credito: ");
		limite = JUtil.readFloat();
		
		novoSaldo = saldoIni + totalCob - totalPag;
		
		if(novoSaldo > limite){
			System.out.println("Limite de credito excedido em R$ " + (novoSaldo - limite) + " reais");
		
		}else{
			System.out.println("Ainda pode comprar R$ " + (limite - novoSaldo) + " reais");
		}

	}
}
