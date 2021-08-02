package br.com.luaazuk.apipersonal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.luaazuk.apipersonal.model.enuns.ContatoTipo;

@Entity
@Table(name= "TB_CONATO")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTATO")
	private Long id;
	
	@Enumerated
	@Column(name= "CD_CONTATO_TIPO", nullable = false)
	private ContatoTipo contatoTipo;
	
	@Column( name = "NM_TELEFONE", nullable = false)
	private String numeroTelefone;
	
	public Contato() {
	
	}
	
	
	
}
