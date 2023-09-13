package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContato() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibircontatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
			if(numeroPorNome == null) {
				System.out.println("Contato não encontrado na agenda.");
			}
		} else {
			System.out.println("A agenda de contatos está vazia.");
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContato AgendaContato = new AgendaContato();	
	
	
		//Adicionar contatos
		AgendaContato.adicionarContato("Camila",123456);
		AgendaContato.adicionarContato("joão",5665);
		AgendaContato.adicionarContato("Carlos",1111111);
		AgendaContato.adicionarContato("Ana",654987);
		AgendaContato.adicionarContato("Maria",1111111);
		AgendaContato.adicionarContato("Camila",44444);
		
		AgendaContato.exibircontatos();
		
		//Remover um contato
		AgendaContato.removerContato("Maria");
		AgendaContato.exibircontatos();
		
		//String número por nome
		String nomePesquisa = "João";
		Integer numeroPesquisa = AgendaContato.pesquisarPorNome("João");
		System.out.println("Número de telefone de " + nomePesquisa +" : " +numeroPesquisa);
				
		String nomePesquisaNaoExistente = "Paula";
		Integer numeroPesquisaNaoExistente = AgendaContato.pesquisarPorNome(nomePesquisaNaoExistente);
		System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);			
	}
}
	
	

