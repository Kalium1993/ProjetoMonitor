package a;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String resp1 = "S";
		
		
		Mercado mercado = new Mercado();
		
		System.out.println("-- MERCADINHO --");
		System.out.println(" ");
		
		while (resp1.equals("S")) {
			System.out.println("Adicione uma marca");
			String nomeMarca = kb.nextLine();
			
			
			Marca marca = new Marca(nomeMarca);
			
			mercado.addMarca(marca);

			System.out.println("----------------------------------------------------");
			System.out.println(" ");
			String resp2 = "S";
			while (resp2.equals("S")) {
				System.out.println("Adicione o nome do produto a marca " + nomeMarca);
				String nomeProduto = kb.nextLine();
				
				
				System.out.println("Descrição do produto " + nomeProduto);
				String descricaoProduto = kb.nextLine();
				
				
				System.out.println("Preco do produto " + nomeProduto);
				float precoProduto = kb.nextFloat();
				kb.nextLine();
				
				Produto produto = new Produto(nomeProduto, descricaoProduto, precoProduto);
				
				marca.addProduto(produto);
				
				System.out.println(" ");
				System.out.println("Adicionar outro produto a marca " + nomeMarca + "?");
				resp2 = kb.nextLine();
				// uppercase deixa tudo maiúsculo, e trim tira o espeaço antes da primeira letra, e depois da última letra
				resp2 = resp2.toUpperCase().trim();
				
				System.out.println("----------------------------------------------------");
				System.out.println(" ");
			}
			
			System.out.println("Adicionar outra marca?");
			resp1 = kb.nextLine();
			resp1 = resp1.toUpperCase().trim();
			
			System.out.println(" ");
			System.out.println("----------------------------------------------------");
		}
		
		System.out.println(" ");
		System.out.println("LISTA DE PRODUTOS:");
		mercado.listaProdutos();
		System.out.println("----------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("Filtrar por marca");
		String filtroMarca = kb.nextLine();
		System.out.println("Carregando produtos da marca " + filtroMarca + "...");
		mercado.filtrarMarca(filtroMarca);
		System.out.println("----------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("Filtrar produto específico da marca " + filtroMarca);
		String filtroProduto = kb.nextLine();
		System.out.println(" ");
		System.out.println("Carregando produto filtrado ("+filtroProduto+") da marca " + filtroMarca + "...");
		mercado.filtrarProdutosMarca(filtroMarca, filtroProduto);
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------");
	
		System.out.println("Valor do Estoque: R$" + mercado.valorTotal());
		
		kb.close();
	}
}
