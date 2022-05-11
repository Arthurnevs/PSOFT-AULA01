package Mercado;

public class Produto {

	private String id;
	private String nome;
	private String fabricante;
	
	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.fabricante = descricao;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + fabricante + "]";
	}

	
	
	
	

	
	
	
}
