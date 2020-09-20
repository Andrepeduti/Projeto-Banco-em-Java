package Entidades;

public abstract class ContaBancaria {

	private int numero;
	private double saldo;
	
	public ContaBancaria(int numero, double saldo) 
	{
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void emiteExtrato()
	{
		System.out.println("Extrato Bancário");
		System.out.println("Número da conta: "+this.numero);
		System.out.println("Saldo: R$"+this.saldo);
	}
	
	
	public double credito(double valor)
	{
		this.saldo = this.saldo + valor;
		return this.saldo;
	}
	 
	public double debito(double valor)
	 {
		if(valor<this.saldo) 
		{
			this.saldo -= valor;
			return this.saldo;
		}
		 else 
		 {
			 System.out.println("Valor insuficiente");
			 return this.saldo;
		 }
	 }
	
	
	

}
