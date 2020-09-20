package Principal;

import java.util.Scanner;

import Entidades.ContaCorrente;
import Entidades.ContaEmpresa;
import Entidades.ContaEspecial;
import Entidades.ContaPoupança;

public class Banco {

	public static void main (String[] args)
	{
		System.out.println(" - BANCO GG - ");
		ContaCorrente CC = new ContaCorrente(8,805568-1, 405); // (int talonario, int numero, double saldo) 
		ContaPoupança CP = new ContaPoupança(0.4, 0.5, 10, 855412, 200); //(double juros, double corrMonetaria, int mesAniversario, int numero, double saldo) 
        ContaEmpresa CE = new ContaEmpresa(100, 500465-4, 250);	// double limiteEmpresa, int numero, double saldo) 
	    ContaEspecial CEsp = new ContaEspecial(300, 807060-2, 800); // (double limite, int numero, double saldo) 
	    
	    Scanner kb = new Scanner (System.in);
	    
	    int decisao;
	    
	    System.out.println("Digite a conta que você quer acessar:");
	    System.out.println("Conta Corrente CC [1]: ");
	    System.out.println("Conta Poupança CP [2]: ");
	    System.out.println("Conta Empresarial CE [3]: ");
	    decisao=kb.nextInt();
	    
	    if (decisao == 1)
	    {
	    	System.out.println("\n==========CONTA CORRENTE==========");
			System.out.println("TALONARIO: ");
			CC.talonario();
			System.out.println("SALDO CONTA CORRENTE: "+CC.getSaldo());
			CC.credito(100);
			System.out.println("CREDITOU 100");
			System.out.println("SALDO CONTA CORRENTE: "+CC.getSaldo());
			CC.debito(-100);
			System.out.println("DEBITOU 100");
			System.out.println("SALDO CONTA CORRENTE: "+CC.getSaldo());
			CC.emiteExtrato();
			System.out.println("\n");
			System.out.println("\n==========CONTA ESPECIAL==========");
			System.out.println("SALDO DA CONTA ESPECIAL: "+CE.getSaldo());
			CEsp.debito(12.0);
			CEsp.calculoJuros();
	    }
	    
	    if (decisao == 2)
	    {
	    	System.out.println("==========CONTA POUPANÇA==========");
			System.out.println("SALDO DA CONTA POUPANÇA: "+CP.getSaldo());
			CP.aniversarioMes();
			System.out.println("RENDIMENTO: ");
			CP.emiteExtrato();
			System.out.println("\n");
	    }
	    
	    if(decisao == 3)
	    {
	    	if(decisao==3) 
	    	{
	    		System.out.println("*****************CONTA EMPRESA*****************");
	    		System.out.println("SALDO DA CONTA EMPRESA: "+CE.getSaldo());
	    		CE.getLimiteEmpresa();
	    		CE.emprestimoEmpresarial(40);
	    		CE.emiteExtrato();
	        }
	    
	    }
	}
}
