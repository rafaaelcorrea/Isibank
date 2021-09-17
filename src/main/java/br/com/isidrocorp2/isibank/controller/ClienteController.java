package br.com.isidrocorp2.isibank.controller;

import java.util.ArrayList;

// IMPORTAÇÃO DO AUTOWIRED 
import org.springframework.beans.factory.annotation.Autowired;
// IMPORTAÇÃO DO GETMAPPING
import org.springframework.web.bind.annotation.GetMapping;
// IMPORTAÇÃO DO RESTCONTROLLER 
import org.springframework.web.bind.annotation.RestController;
// IMPORTTAÇÃO DA CLASSE CLIENTE DO DAO
import br.com.isidrocorp2.isibank.dao.ClienteDAO;
// IMPORTAÇÃO DA CLASSE CLIENTE DO MODEL
import br.com.isidrocorp2.isibank.model.Cliente;

@RestController

public class ClienteController {

	@Autowired
	private ClienteDAO dao;

	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperarTodos() {

		return (ArrayList<Cliente>) dao.findAll();

	}
}
