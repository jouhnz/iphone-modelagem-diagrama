package iphone;

import tarefas.Internet;
import tarefas.Musica;
import tarefas.Telefone;

public class Iphone implements Internet, Musica, Telefone {

	@Override
	public void ligar(int numero) {
		System.out.println("Ligando para " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Chamada Atendida");

	}


	@Override
	public void exibirPagina() {
		System.out.println("Carragando Pagina");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina recarregada");

	}



	@Override
	public void pausar() {
		System.out.println("Musica pausada");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");

	}

	@Override
	public void recusar() {
		System.out.println("Chamada recusada");
	}

	@Override
	public void vivaVoz() {
		System.out.println("Chamada alterada para o modo viva voz");
	}

	@Override
	public void modoEspera() {
		System.out.println("Chamada em modo de espera");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
		
	}

	@Override
	public void encerrarChamada() {
		System.out.println("Chamada encerrada");
		
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo música");
	}

	@Override
	public void proxima() {
		System.out.println("Próxima música");
		
	}

	@Override
	public void retroceder() {
		System.out.println("Voltando para a última música");
		
	}

}