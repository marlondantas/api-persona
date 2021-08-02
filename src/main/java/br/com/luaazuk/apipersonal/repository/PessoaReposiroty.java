package br.com.luaazuk.apipersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luaazuk.apipersonal.model.Pessoa;

public interface PessoaReposiroty extends JpaRepository<Pessoa,Long> {

}
