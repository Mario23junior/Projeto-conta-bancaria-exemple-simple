package ContaB;

public class Clientes {
  
	 public static void main(String[] args) {
		
		  Conta c1 = new Conta();
		  c1.dono = "Duke";
		  c1.saldo = 227;
 		  
		  Conta c2 = new Conta();
		  c2.dono = "Duke";
		  c2.saldo = 227;
		  
		  if(c1 == c2) {
			  System.out.println("Contas Iguais");
		  }
	}
}
