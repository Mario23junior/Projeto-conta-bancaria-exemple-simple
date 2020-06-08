package ContaB.Exercicio;

public class Funcionario {

	 String nomeFuncionario;
	 String departamento;
	 double dataEntrada;
	 double salario;
	 String RG;
	 double beneficar;
	 boolean estaOuNao = true;
	 
	 void ondeTrabalha(String lugar) {
 		System.out.println("Trabalho do departamento de "+ departamento);
	 }
	 
	 boolean EstaOuNao(boolean esta) {
		 if(this.estaOuNao == false) {
			 return false;
		 }else {
			 return true;
		 }
	 }
	 
	 double benefica(double benefi) {
		 return this.salario += benefi;
	 }
	 
	void  mostrarDados(){
		 System.out.println("Nome :"+ this.nomeFuncionario);
		 System.out.println("Departamento :"+ this.departamento);
		 System.out.println("Data de contratação :"+ this.dataEntrada);
		 System.out.println("Salrio :"+ this.salario);
		 System.out.println("dado de  indendificação :"+ this.RG);
		 System.out.println("Atribuindo beneficação :"+ this.beneficar);
		 System.out.println("Status Atual:"+ this.estaOuNao);

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
 	 }	 
}
