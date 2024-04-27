class estacao 
{
	public static void main(String[] args) throws Exception
	{	
		short mes;
		String estacao;
		System.out.println("Digite o mes: ");
		mes = JUtil.readShort();
		switch(mes){
			
			case 12:
			case 1:
			case 2:
				estacao = "Verao";
				break;
			case 3:
			case 4:
			case 5:
				estacao = "Outono";
				break;
			case 6:
			case 7:
			case 8:
				estacao = "Inverno";
				break;
			case 9:
			case 10:
			case 11:
				estacao = "Primavera";
				break;
			default:
				estacao = "Invalido";
				System.out.println("Um ano tem 12 meses (Vc eh burro? (._.))");
		}
		System.out.println("Estacao: " + estacao);
			
			
	}
}
