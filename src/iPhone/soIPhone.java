package iPhone;

import iPhone.internet.navegador;
import iPhone.musicas.reprodutormusicas;
import iPhone.telefone.telefone;
import iPhone.soIPhone;

public class soIPhone implements reprodutormusicas,navegador,telefone {


		@Override
		public void ligar() {
			System.out.println("Tocando musica");
		}

		@Override
		public void atender() {
			System.out.println("atendendo a ligação");
			
		}

		@Override
		public void iniciarCorreioVoz() {
			System.out.println("Ligando para correio de voz");
			
		}

		@Override
		public void exibirPagina() {
			System.out.println("Exibindo pagina de navegação");
		}

		@Override
		public void adicionarNovaAba() {
			System.out.println("Abrindo nova aba de navegação");
			
		}

		@Override
		public void atualizarPagina() {
			System.out.println("Atualizando pagina");
			
		}

		@Override
		public void tocar() {
			System.out.println("Tocando musica");
		}

		@Override
		public void pausar() {
			System.out.println("Pausando musica");
		}

		@Override
		public void selecionarmusica() {
			System.out.println("Selecionando musica");
		}

		public reprodutormusicas getreprodutormusicas() {
			// TODO Auto-generated method stub
			return null;
		}

		public navegador getnavegador() {
			// TODO Auto-generated method stub
			return null;
		}

		public telefone gettelefone() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

