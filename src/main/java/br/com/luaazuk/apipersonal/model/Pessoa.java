package br.com.luaazuk.apipersonal.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOA")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PESSOA")
	private Long id;
	@Column(name = "NM_PRIMERO", nullable = false)
	private String primeroNome;
	@Column(name = "NM_SEGUNDO", nullable = false)
	private String segundoNome;
	@Column(name = "NR_CPF", nullable = false, unique = true)
	private String cpf;
	@Column(name = "DT_NASCIMENTO", nullable = false)
	private Date dataNascimento;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Contato> telefones;
	
	
	public Pessoa() {
	}
	
}
