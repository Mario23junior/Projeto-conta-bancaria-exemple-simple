package ContaB.Carro;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.modelo = "Fusca";
		carro1.cor = "Preto fosco";
		carro1.velocidadeAtual = 0;
		carro1.velocidadeMaxima = 90;
		
		// ligando carro
		carro1.ligar(); 	 
		
        // Acelerar Carro
		carro1.acelerar(20);
		System.out.println(carro1.velocidadeAtual);
		
		
		carro1.motor.potencial = 40;
		carro1.motor.tipo = "code";
	}
 }
