package Entidades;

import java.util.Calendar;

public class ContaPoupança extends ContaBancaria {
	
	private double juros;
	private double corrMonetaria;
	private int mesAniversario;
	
	public ContaPoupança(double juros, double corrMonetaria, int mesAniversario, int numero, double saldo) 
	{
		super(numero, saldo);
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}

	public double getJuros() 
	{
		return juros;
	}

	
	public void setJuros(double juros) 
	{
		this.juros = juros;
	}

	
	public double getCorrMonetaria() 
	{
		return corrMonetaria;
	}

	
	public void setCorrMonetaria(double corrMonetaria) 
	{
		this.corrMonetaria = corrMonetaria;
	}

	
	public int getMesAniversario() 
	{
		return mesAniversario;
	}

	
	public void setMesAniversario(int mesAniversario) 
	{
		this.mesAniversario = mesAniversario;
	}
	
	public void aniversarioMes()
	{
		Calendar niver = Calendar.getInstance();
		
		if(mesAniversario == niver.get(Calendar.DAY_OF_MONTH))
		{
			double valor = 0;
			valor = super.getSaldo() * (this.juros+this.corrMonetaria);
			credito(valor);
		}

		else
		{
			System.out.println("Hoje não é aniversário do investimento");
		}
	}
}
