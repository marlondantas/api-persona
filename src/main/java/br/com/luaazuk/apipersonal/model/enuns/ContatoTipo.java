package br.com.luaazuk.apipersonal.model.enuns;

public enum ContatoTipo {

	CASA("CASA"),
	CELULAR("CELULAR"),
	COMERCIAL("COMERCIAL");
	
	ContatoTipo(String tipo) {
		this.descricao = tipo;		
	}
	
	private final String descricao;
	
}
