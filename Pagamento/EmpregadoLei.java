class EmpregadoLei extends Empregado 
{
	public EmpregadoLei(int mat, String nom, float sBase){
		super(mat, nom, sBase);
	}

	public void setSalarioBase(float sBase){
		if(sBase > super.getSalarioBase()){
			super.setSalarioBase(sBase);
		}else{
			System.out.println("O novo salario deve ser maior que o atual!");
		}
	}
}
