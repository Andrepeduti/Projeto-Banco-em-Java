package Entidades;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;

	public ContaEspecial(double limite, int numero, double saldo) 
	{
		super(numero, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double debito(double valor)
	{
		double saldoComLimite=getSaldo()+limite;
		if((saldoComLimite-valor)>=-0)
		{
			limite = getSaldo()-valor;
			System.out.println("Saldo disponível: R$"+limite);
			return limite;
		}
		else
		{
			System.out.println("Você ultrapassou o seu limite");
			return limite;
		}
	}
	
	public void calculoJuros()
	{
		if (this.getLimite()<0)
		{
			this.limite=limite+limite*0.16;
			System.out.println("Saldo corrigido com Juros: R$"+this.limite);	
		}
	}

}
