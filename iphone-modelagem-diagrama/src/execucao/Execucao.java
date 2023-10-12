package execucao;

import iphone.Iphone;

public class Execucao {
	
	public static void main(String[] args) {
		Iphone iphoneOne = new Iphone();
		iphoneOne.adicionarNovaAba();
		iphoneOne.atender();
		iphoneOne.atualizarPagina();
		iphoneOne.reproduzir();
		iphoneOne.pausar();
		iphoneOne.selecionarMusica();
		iphoneOne.ligar(12312412);
		iphoneOne.iniciarCorreioVoz();
		iphoneOne.exibirPagina();
	}

}