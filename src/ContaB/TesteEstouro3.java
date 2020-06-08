package ContaB;

public class TesteEstouro3 {
      
	public static void main(String[] args) {
		
		// a conta
		Conta minhaConta = new Conta();
		minhaConta.limite = 100;
		minhaConta.saldo = 200;
		
		 // quero mudar osaldo para -200
		double novoSaldo = -200;
		 
         // testa se o novosaldo ultrapassa o limite da conta
		    if(novoSaldo < -minhaConta.limite ) {
		    	System.out.println("Não posso mudar para esse valor");
		    }else {
		    	minhaConta.saldo = novoSaldo;
		    }
		
	}
	
}
