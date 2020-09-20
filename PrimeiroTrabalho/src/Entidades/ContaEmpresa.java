package Entidades;

public class ContaEmpresa extends ContaBancaria {
	
	private double limiteEmpresa;

	
	public ContaEmpresa(double limiteEmpresa, int numero, double saldo) 
	{
		super( numero, saldo);
		this.limiteEmpresa = limiteEmpresa;
	}


	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}


	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}
	
	public void emprestimoEmpresarial (double emprestimo)
	{
		if (getSaldo() <=(this.limiteEmpresa/2) && emprestimo <= (this.limiteEmpresa*2))
		{
			credito(emprestimo);
			System.out.println("Emprestimo liberado: R$"+emprestimo);
		}
		else 
		{
			System.out.println("Empréstimo negado");
		}
	}
	

}
