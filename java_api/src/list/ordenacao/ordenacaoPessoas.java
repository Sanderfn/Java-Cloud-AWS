package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoPessoas {
	//atributo
	
	private List<Pessoa> pessoaList;
	
		public ordenacaoPessoas() {
			this.pessoaList = new ArrayList<>();
		}
		
		public void adicionarPessoa(String nome, int idade, double altura) {
			pessoaList.add( new Pessoa(nome, idade, altura));
		}
		
		public List<Pessoa> ordenarPorIdade() {
			List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
			if (!pessoaList.isEmpty()) {
				Collections.sort(pessoasPorIdade);
				return pessoasPorIdade;
			} else {
				throw new RuntimeException("A lista está vazia!");
			}
		}
		
		 public List<Pessoa> ordenarPorAltura() {
			 List<Pessoa> pessoasPorAltura = new ArrayList <> (pessoaList);
			 if(!pessoaList.isEmpty()) {
				 Collections.sort(pessoasPorAltura);
				 return pessoasPorAltura;
			 } else {
				 throw new RuntimeException("A lista está Vazia!");
			 }
		 }
		
		 public static void main (String[] args) {
			 //Criando uma instância da classe OrdenacaoPessoas
			 ordenacaoPessoas ordenacaoPessoas = new ordenacaoPessoas();
			 
			 // Adicionando pessoas á lista
			 ordenacaoPessoas.adicionarPessoa("Alice",20, 1.56);
			 ordenacaoPessoas.adicionarPessoa("Bob",30, 1.80);
			 ordenacaoPessoas.adicionarPessoa("Charlie",25,1.70);
			 ordenacaoPessoas.adicionarPessoa("Antony",17,1.56);
			 
			 //Exibindo a lista de pessoas adicionadas
			//System.out.println(ordenacaoPessoas.pessoaList);
			
			 //Ordenando e exibindo por idade
			 System.out.println(ordenacaoPessoas.ordenarPorIdade());
			 
			 //Ordenacao e exibindo por altura
		//	 System.out.println();
		 }
		
		
		
		
		
		
}
