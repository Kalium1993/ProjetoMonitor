package a;

import java.util.ArrayList;
import java.util.List;

public class Marca {
	
	private String nome;
	private List<Produto> produtos;
	
	
	public Marca(String nome) {
		this.nome = nome;
		this.produtos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
}
