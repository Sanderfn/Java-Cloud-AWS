package iPhone;

import iPhone.internet.navegador;
import iPhone.musicas.reprodutormusicas;
import iPhone.telefone.telefone;
import java.util.Scanner;

public class iPhoneV2 {
	public static void main (String[] args) {
		soIPhone iPhone = new soIPhone();
		telefone Telefone = (telefone) iPhone;
		navegador Navegador = (navegador) iPhone;
		reprodutormusicas Musicas = (reprodutormusicas) iPhone;
		
		System.out.println("Telefone");
		Telefone.ligar();
		Telefone.atender();
		Telefone.iniciarCorreioVoz();
 		System.out.println("");
 		
 		System.out.println("Navegador Internet");
 		Navegador.exibirPagina();
 		Navegador.adicionarNovaAba();
 		Navegador.adicionarNovaAba();
 		System.out.println("");
 		
 		System.out.println("Reprodutor de musicas");
 		Musicas.tocar();
 		Musicas.pausar();
 		Musicas.selecionarmusica();
 		
	}
}		
	
