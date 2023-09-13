package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EstoqueProdutos {

	private static final int preco = 0;
	private Map<Long,Produto> estoqueProdutoMap;

	public EstoqueProdutos() {
		this.estoqueProdutoMap = new HashMap<>();
	}
	
		
	private void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade ));
	}
	
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);		
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			} 
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro () {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutoMap.isEmpty()) {
		for(Produto p: estoqueProdutoMap.values()) {
			if(p.getPreco() > maiorPreco) {
				produtoMaisCaro =p;
				maiorPreco = p.getPreco();
			 }
		     }
		}
		return produtoMaisCaro;		
	}		
	
	public Produto obterprodutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MIN_VALUE;
		for(Produto p : estoqueProdutoMap.values()) {
		 if(p.getPreco() > menorPreco) {
			produtoMaisBarato = p; 
			menorPreco = p.getPreco();
		 }
		 }
		 return produtoMaisBarato;
		}
		
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque()	{
		Produto produtoMaiorQuantidadeValorNoEstoque = null;
		double maiorValorTotalProdutoEstoque = 0d;
		if (!estoqueProdutoMap.isEmpty()) {
		 for(Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
		   double valorProdutoEmEstoque =  entry.getValue().getPreco() * entry.getValue().getQuantidade();
		   if(valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
			   maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
			   produtoMaiorQuantidadeValorNoEstoque = entry.getValue();		   
		   }
		 }
		}
		return produtoMaiorQuantidadeValorNoEstoque;
	}
	
	public static void main(String [] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
	//Exibe o estoque vazio
	estoque.exibirProdutos();
	
	//Adiocna produtos ao estoque
	estoque.adicionarProduto(1L,"Notebook", 1, 1500.0);
	estoque.adicionarProduto(2L,"Mouse", 5, 25.0);
	estoque.adicionarProduto(3L,"Monitor", 10, 400.0);
	estoque.adicionarProduto(4L,"Teclado", 2, 40.0);
	
	//Exibe os produtos no estoque
	estoque.exibirProdutos();
	
	//Calcula e exibe o valor total do estoque
	System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
	
	//Obtém e exibe o produto mais caro
	Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
	System.out.println("Produto mais caro: " + produtoMaisCaro);
	
	//obtém e exibe oproduto mais barato
	Produto produtoMaisBarato = estoque.obterProdutoMaisCaro();
	System.out.println("Produto mais barato:" + produtoMaisBarato);
	
	//Obtém e exibe o produto a maior quantidade em valor no estoque
	Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	}
	
}




