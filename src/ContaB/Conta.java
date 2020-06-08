package ContaB;

public class Conta {
  
	 int numero;
	 String dono;
	private double saldo;
	private double limite;
 	 
	 void ImprimirBanco() {
		 System.out.println("Esta conta e do banco inter");
	 }
	 
	 void depositar(double quantidade) {
		 this.saldo += quantidade;
	 }
	 
	 // verificando se o valor e maio que o disponivel p
	 public void saca(double quantidade) {
		if(quantidade > this.saldo + this.limite) { //saldo+limite;
		    System.out.println("Não posso sacar fora do limite");
		 }else {  
			 this.saldo = this.saldo - quantidade;
		 }	
	 }
		
		  
	// trasferindo dinheiro     
	  boolean transfere(Conta destino, double valor) {
		  boolean retirou = this.saca(valor);
		   if(retirou == false) {
			    //não deu pra sacar
			   return false;
		   }else {
			   destino.depositar(valor);
			   return true;
		   }
	  }
}
 