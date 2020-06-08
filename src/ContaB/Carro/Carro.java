package ContaB.Carro;

public class Carro {
    
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;
	
	 // ligar carro
	 void ligar() {
		  System.out.println(" o carro esta ligado");
	 }
	 
	 // Acelerar até umá certá velocidade
	  void acelerar(double quantidade) {
		  double velocidadeNova = this.velocidadeAtual + quantidade;
		  this.velocidadeAtual = velocidadeNova;
	  }
	  
	  // devolve a marcha do carro
	  int pegaMarcha() {
		   if(this.velocidadeAtual < 0) {
			   return -1;
		   }
		   
		   if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			   return 1;
		   }
		   
		   if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			   return 2;
		   }
		   return 3;
	 }
}
