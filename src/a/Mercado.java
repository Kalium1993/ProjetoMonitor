package a;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Mercado { 
	//Decimal Format serve pra limitar o número de casas após a vírgula
	DecimalFormat df = new DecimalFormat("0.00");
	
	private List<Marca> marcas;
	
	public Mercado() {
		marcas = new ArrayList<>();
	}

	public List<Marca> getMarcas() {
		return marcas;
	}

	public void addMarca(Marca marca) {
		this.marcas.add(marca);
		
	}
	
	
	public void listaProdutos() {
		for(Marca marca : marcas) {
			for(Produto produto : marca.getProdutos()) {
				System.out.println("Marca: " + marca.getNome() + " - Produto: " + produto.getNome() + " - Descrição: " + produto.getDescricao() + " - Preço: " + df.format(produto.getValorUnitario()));
			}
		}
	}

	public void filtrarMarca(String filtroMarca) {
		boolean achou = false;
		for(Marca marca : marcas) {
			for(Produto produto : marca.getProdutos()) {
				if (filtroMarca.equals(marca.getNome())) {
					System.out.println("Marca: " + marca.getNome() + " - Produto: " + produto.getNome() + " - Descrição: " + produto.getDescricao() + " - Preço: " + df.format(produto.getValorUnitario()));
					achou = true;
				}
			}
		}
		if (!achou) {
			System.out.println("ERRO!!! Marca não encontrada");
		}
		
	}

	public void filtrarProdutosMarca(String filtroMarca, String filtroProduto) {
		boolean achou = false;
		for(Marca marca : marcas) {
			for(Produto produto : marca.getProdutos()) {
				if (filtroMarca.equals(marca.getNome()) && filtroProduto.equals(produto.getNome())) {
					System.out.println("Marca: " + marca.getNome() + " - Produto: " + produto.getNome() + " - Descrição: " + produto.getDescricao() + " - Preço: " + df.format(produto.getValorUnitario()));
					achou = true;
				}
			}
		}
		if (!achou) {
			System.out.println("ERRO!!! Produto não encontrado");
		}
		
	}

	public float valorTotal() {
		float calculo = 0;
		for(Marca marca : marcas) {
			for(Produto produto : marca.getProdutos()) {
				calculo += produto.getValorUnitario();
			}
		}
		return calculo;
		
	}
	
}
