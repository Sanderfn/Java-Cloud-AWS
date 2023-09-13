package set.Pesquisa;

import java.util.Objects;

public class Contato {
	//atributos
	
	private String nome;
	private int numero;
	
	public Contato (String nome, int numero ) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getnome() {
		return nome;
	}
	
	public int getcontato() {
		return numero;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(! (o instanceof Contato contato)) return false;
		return Objects.equals(getnome(), contato.getnome());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getnome());
	}

	@Override
	 public String toString() {
		 return "{"+ nome + "," + numero + "}";
	 }

	public void setnumero(int novoNumero) {
		// TODO Auto-generated method stub
		
	}


}
	
