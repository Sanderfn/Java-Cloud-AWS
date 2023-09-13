package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
	
	//Atributo
	
	private Set<Contato> contatoSet;
	
	public AgendaContato() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarcontato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		if(!contatoSet.isEmpty()) {
			System.out.println(contatoSet);
		}
		else { 
			System.out.println("O conjunto está vazio! ");
		}
	}
	
	public Set<Contato> pesquisaPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet <>();
		if (!contatoSet.isEmpty()) {
			for (Contato c :contatoSet) {
				if(c.getnome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
			return contatosPorNome;
	} else {
		throw new RuntimeException("O conjunto está vazio!");
	}
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if(!contatoSet.isEmpty()) {
			for (Contato c : contatoSet) {
				if(c.getnome().equalsIgnoreCase(nome)) {
				c.setnumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	} else {
		throw new RuntimeException(" O conjunto está vazio! ");
		}
	}
	
	public static void main (String[] args) {
		
		//criando uma instância da classe AgendaContatos
		AgendaContato agendaContatos = new AgendaContato();
		
		//Exibindo os contatos no conjunto (deve estar vazio)
		agendaContatos.exibirContatos();
		
		//Adicionando contatos à agenda
		agendaContatos.adicionarcontato("João",123456789);
		agendaContatos.adicionarcontato("Maria",987654321);
		agendaContatos.adicionarcontato("Maria Fernandes",555555555);
		agendaContatos.adicionarcontato("Ana",888899999);
		agendaContatos.adicionarcontato("Fernando", 777778888);
		agendaContatos.adicionarcontato("Carolina",555555555);
	
		
		//Exibindo os contatos na agenda 
		agendaContatos.exibirContatos();
		
		// Pesquisando contatos pelo nome
		System.out.println(agendaContatos.pesquisaPorNome("Maria"));
		
		//Atualizando o número de um contato
		Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 444443333);
		System.out.println("Contato atualizado: " + contatoAtualizado);
		
		//Exibido os contatos atualizados na agenda
		System.out.println("Contatos na agenda após atualização: ");
		agendaContatos.exibirContatos();
	}	
}