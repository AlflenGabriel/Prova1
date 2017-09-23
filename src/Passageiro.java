
public class Passageiro {
	
	private String nome;
	private int idade;
	private String cidade;
	private String uf;
	
	
	public Passageiro(String nome, int idade, String cidade, String uf) {
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
		this.uf = uf;
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
