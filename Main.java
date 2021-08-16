package fabrica;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Collection funcionarios = new ArrayList<Pessoa>();
		Pessoa funcionario1 = new Pessoa("josevaldo Roraima", "Rua das macaxeiras cozidinhas");
		Pessoa funcionario2 = new Pessoa("joazin Tapioca", "Rua das tapioca voadora");
		Pessoa funcionario3 = new Pessoa("Junin Pipoqueiro","Rua evagelista cardoso");
		Pessoa funcionario4 = new Pessoa("Janaina de Paula","Rua dos bem-te-vis cantantes");
		
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		funcionarios.add(funcionario4);
		
		Iterator iteFuncionarios = funcionarios.iterator();
		while(iteFuncionarios.hasNext()) {
			Pessoa pessoaRecuperada = (Pessoa) iteFuncionarios.next(); 
			System.out.println("Pessoa Recuperada: " + pessoaRecuperada.getNome() + "\nEndereço Recuperado: " + pessoaRecuperada.getEndereco() + "\n");
		}
		
	}
}
