package Mercado;

public class Produto {

	private String id;
	private String nome;
	private String descricao;
	
	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + "]";
	}
	
	
	

	
	
	
}
