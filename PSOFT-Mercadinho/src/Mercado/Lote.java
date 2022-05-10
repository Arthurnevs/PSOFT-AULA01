package Mercado;

public class Lote {

	private String id;
	private Produto produto;
	private int quantidade;
	
	public Lote(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Lote [produto=" + produto + ", quantidade=" + quantidade + "]";
	}
	
	
	
	
}
