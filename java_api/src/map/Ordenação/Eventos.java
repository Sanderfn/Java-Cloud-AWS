package map.Ordenação;



public class Eventos {

	
	private String nome;
	private String atracao;
	
	
	public Eventos(String nome, String atracao) {
		super();
		this.nome = nome;
		this.atracao = atracao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAtracao() {
		return atracao;
	}


	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}


	@Override
	public String toString() {
		return "AgendaEventos [nome=" + nome + ", atracao=" + atracao + "]";
	}
	
	
	
	
	
	
}
