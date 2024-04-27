class VetorTeste 
{
	public static void main(String[] args) throws Exception {
		int vet[][] = new int [5][5];
		System.out.println(vet.length);
		System.out.println(vet[0].length);
		for(int i = 0; i < vet.length; i++){
			for(int j = 0; j < vet[0].length; j++){
				System.out.print(vet[i][j] + " | ");
			}
			System.out.println();

		}
	}
}
