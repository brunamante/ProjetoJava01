package br.com.softex.telas;

import br.com.softex.service.ContaService;

public class BancoSoftex {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ContaService.abriLista();
		new TelaPrincipal().main();

	}

}
