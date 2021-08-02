package br.com.luaazuk.apipersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luaazuk.apipersonal.model.Pessoa;
import br.com.luaazuk.apipersonal.repository.PessoaReposiroty;

@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController {
	
	private PessoaReposiroty pessoaReposiroty;
	
	@Autowired
	public PessoaController( PessoaReposiroty pessoaReposiroty) {
		this.pessoaReposiroty = pessoaReposiroty;
	}
	
	@GetMapping
	public String getPessoa() {
		return "API TEST";
	}
	
	@PostMapping
	public String postPessoa(Pessoa pessoa) {
		pessoaReposiroty.save(pessoa);
		return "Pessoa incluuida";
	}
	
	
}
