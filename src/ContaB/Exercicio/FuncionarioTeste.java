package ContaB.Exercicio;

public class FuncionarioTeste {
   
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.nomeFuncionario = "Edmir Borges Silva";
		f1.departamento = "web develop";
		f1.dataEntrada = 232323;
		f1.salario = 3000;
		f1.RG = "233.674.434.44-9";
		f1.beneficar = 23;
		f1.estaOuNao = true;
		
		f1.mostrarDados();
		
		 
	}
}
