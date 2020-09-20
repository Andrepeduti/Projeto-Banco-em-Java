package Entidades;

public class ContaCorrente extends ContaBancaria {
	
	private int talonario;

	public ContaCorrente(int talonario, int numero, double saldo) 
	{
		super(numero, saldo);
		this.talonario = talonario;
	}

	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}
	
	public void talonario ()
	{
		if (talonario<=05)
		{
			talonario = this.talonario+12;
			System.out.println("Talonario reabastecido");
		}
		else
		{
			System.out.println("Você ainda não pode ter mais talões.");
		}
	}
	
	
	

}
