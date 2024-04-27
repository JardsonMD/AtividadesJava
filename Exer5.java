class Exer5 
{
	public static void main(String[] args)throws Exception 
	{
		String nome; 
		char sexo;
		double peso, altura, pIdeal = 0;
			
		System.out.println("Digite seu nome: ");
		nome = JUtil.readString();
		System.out.println("Digite seu peso: ");
		peso = JUtil.readFloat();
		System.out.println("Digite sua altura: ");
		altura = JUtil.readFloat();
		System.out.println("Digite seu sexo(F para Feminino M para Masculino): " );
		sexo = JUtil.readString().charAt(0);
		sexo = Character.toUpperCase(sexo);
		System.out.println(sexo);
		if(sexo == 'M'){
			pIdeal = (72.7 * altura) - 58.00;
		}else if(sexo == 'F'){
			pIdeal = (62.10 * altura) - 44.70;
		}else{
			System.out.println("Resposta Invalida!");
		}
		System.out.println("Nome: " + nome + "\nPeso Ideal: " + pIdeal);
	
	}
}