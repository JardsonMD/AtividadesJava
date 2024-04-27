class LerEsferaCilindro 
{
	public static char lerTipo() throws Exception{
		char tipo;
		do{
			System.out.println("Digite 'E' para Esfera, 'C' para Cilindro ou 'F' para Fim -> ");
			tipo = JUtil.readChar();
		}while((tipo != 'E') && (tipo != 'C') && (tipo != 'F'));
		return tipo;
	}
	public static void main(String[] args) throws Exception
	{
		Circulo forma;
		char resp = lerTipo();
		while(resp != 'F'){

			if (resp == 'E'){
				forma = new Esfera();
			}else{
				forma = new Cilindro();
				System.out.println("Digite a altura: ");
				((Cilindro)forma).setAltura(JUtil.readFloat());
			}
			System.out.println("Digite o raio: ");
			forma.setRaio(JUtil.readFloat());
			forma.mostrarDados();
			resp = lerTipo();
		}
		System.out.println("Fim do programa");
	}
}