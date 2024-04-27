class LerAlunos 
{
	public static void main(String[] args) throws Exception {
		int resp = 0;
		float p1, p2, p3, mTotal = 0, contMaMedia = 0, contMeMedia = 999;
		Aluno maMedia = new Aluno(), meMedia = new Aluno();
		System.out.println("Digite o numero de alunos: ");
		Aluno alunos[] = new Aluno[JUtil.readInt()];
		for(int i = 0; i < alunos.length; i++){
			alunos[i] = new Aluno();
			System.out.println("Digite o codigo do aluno: ");
			alunos[i].codigo = JUtil.readInt();
			System.out.println("Digite o nome do aluno: ");
			alunos[i].nome = JUtil.readString();
			System.out.println("Digite a nota 1 do aluno: ");
			alunos[i].nota1 = JUtil.readFloat();
			System.out.println("Digite a nota 2 do aluno: ");
			alunos[i].nota2 = JUtil.readFloat();
			System.out.println("Digite a nota 3 do aluno: ");
			alunos[i].nota3 = JUtil.readFloat();
		}//For 1
		System.out.println("Fazer a média por pesos? (1 para SIM / 0 para NAO) ");
		resp = JUtil.readInt();
		if(resp == 1){
			System.out.println("Digite os pesos: ");
			System.out.println("Peso 1: ");
			p1 = JUtil.readFloat();
			System.out.println("Peso 2: ");
			p2 = JUtil.readFloat();
			System.out.println("Peso 3: ");
			p3 = JUtil.readFloat();

			for(int i = 0; i < alunos.length; i++){
				mTotal += alunos[i].media(p1,p2,p3);
				if(contMaMedia < alunos[i].media(p1,p2,p3)){
					contMaMedia = alunos[i].media(p1,p2,p3);
					maMedia = alunos[i];
				}
				if(contMeMedia > alunos[i].media(p1,p2,p3)){
					contMeMedia = alunos[i].media(p1,p2,p3);
					meMedia = alunos[i];
				}
				System.out.println("Codigo\tNome\tNota1\tNota2\tNota3\tMedia");
				System.out.println(alunos[i].codigo + "\t" +
					alunos[i].nome + "\t" +
					alunos[i].nota1 + "\t" +
					alunos[i].nota2 + "\t" +
					alunos[i].nota3 + "\t" +
					alunos[i].media(p1,p2,p3));
				}
			System.out.println("\t\t\t\t\t" + (mTotal/alunos.length));
			System.out.println("O aluno com menor media foi " + meMedia.nome + " com " + meMedia.media(p1,p2,p3));
			System.out.println("O aluno com maior media foi " + maMedia.nome + " com " + maMedia.media(p1,p2,p3));
		}else if(resp == 0){
			for(int i = 0; i < alunos.length; i++){
				mTotal += alunos[i].media();
				if(contMaMedia < alunos[i].media()){
					contMaMedia = alunos[i].media();
					maMedia = alunos[i];
				}
				if(contMeMedia > alunos[i].media()){
					contMeMedia = alunos[i].media();
					meMedia = alunos[i];
				}
				System.out.println("Codigo\tNome\tNota1\tNota2\tNota3\tMedia");
				System.out.println(alunos[i].codigo + "\t" +
					alunos[i].nome + "\t" +
					alunos[i].nota1 + "\t" +
					alunos[i].nota2 + "\t" +
					alunos[i].nota3 + "\t" +
					alunos[i].media());
			}
			System.out.println("\t\t\t\t\t" + (mTotal/alunos.length));
			System.out.println("O aluno com menor media foi " + meMedia.nome + " com " + meMedia.media());
			System.out.println("O aluno com maior media foi " + maMedia.nome + " com " + maMedia.media());
		}else{
			System.out.println("Resposta Invalida");
		}//Bloco if



	}//Main
}//Class
