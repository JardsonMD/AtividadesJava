class  Contador
{
	public static void main(String[] args) throws Exception{
		int n, cont = 1, resp = 1;
		System.out.println("Digite um numero inteiro: ");
		n = JUtil.readInt();
		while(cont <= n && resp != 0){
			if(cont == n || (cont % 5) == 0){
				System.out.print(cont);
			}else{
				System.out.print(cont + ", ");
			}
			if((cont % 5) == 0){
				System.out.print("\n");
			}
			if(cont < n && (cont % 10) == 0){
				System.out.print("Digite 0 caso deseje parar: ");
				resp = JUtil.readInt();
			}
			cont++;
			
		}
			
	}
}
