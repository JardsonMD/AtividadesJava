class FolhaPagamento 
{
	public static void main(String[] args) 
	{
		EmpregadoLei emp1 = new EmpregadoLei(1, "Joao", 600f);
		EmpregadoComissao emp2 = new EmpregadoComissao(2, "Maria", 1000f, 10f);

		emp1.mostrarDados();
		emp2.mostrarDados();

		emp1.setSalarioBase(500f);

		System.out.println("Salario liquido Joao: " + emp1.salarioLiquido() + "\n" +
			"Salario liquido Maria: " + emp2.salarioLiquido(100f));

		emp1.setSalarioBase(700f);
		emp2.setSalarioBase(1200f);

		emp1.mostrarDados();
		emp2.mostrarDados();

		System.out.println("Salario liquido Joao: " + emp1.salarioLiquido() + "\n" +
			"Salario liquido Maria: " + emp2.salarioLiquido(200f));

	}
}
