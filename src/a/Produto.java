package a;

public class Produto {
	private String nome;
	private String descricao;
	private float valorUnitario;

	public Produto(String nome, String descricao, float valorUnitario) {
		this.nome = nome;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
