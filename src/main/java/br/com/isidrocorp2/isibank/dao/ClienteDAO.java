package br.com.isidrocorp2.isibank.dao;

// iMPORTAÇÃO DA BIBLIOTECA CHAMADA CRUD DO SPRING.

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp2.isibank.model.Cliente;

// O EXTENDS IRÁ HERDAR O CRUD REPOSITORY
public interface ClienteDAO extends CrudRepository<Cliente,Integer>{

	
}
