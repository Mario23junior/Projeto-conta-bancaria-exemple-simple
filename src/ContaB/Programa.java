package ContaB;

public class Programa {
     
	public static void main(String[] args) {
		 
 //criando conta
	 Conta minhaConta = new Conta();
	 
 //Alterando valores da minha conta 
	 minhaConta.dono = "Mario";
	 minhaConta.saldo = 1000;
	 minhaConta.limite = 1000.32;
	 
 	Conta nunca = new Conta();
	 nunca.dono = "Mario junior";
	 nunca.saldo = 2000;
	 nunca.limite = 40.000;
	 nunca.saca(3);
	 
  	 
 //sacando Dinheiro
	  minhaConta.saca(200);
	  
	 //depositando conta
	  minhaConta.depositar(500);
	  System.out.println(minhaConta.saldo);
	 	   
	}
} 
