package fabrica;

public class Pessoa {
	private String nome;
	private String endereco;
	
	public Pessoa(String nome, String endereco) {
		this.endereco = endereco;
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getNome() {
		return nome;
	}
	
	
}
