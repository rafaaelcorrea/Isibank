package br.com.isidrocorp2.isibank.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp2.isibank.dao.ContaDAO;
import br.com.isidrocorp2.isibank.model.Conta;

@RestController

public class ContaController {

	@Autowired
	private ContaDAO dao;

	@GetMapping("/contas")
	public ArrayList<Conta> recuperarTodas() {

		return (ArrayList<Conta>) dao.findAll();

	}
	
	@GetMapping("/contas/{numero}")
	public ResponseEntity<Conta> recuperarPeloNumero(@PathVariable int numero) {
		
		Conta resultado = dao.findById(numero).orElse(null);
		
		if ( resultado != null ) {
			
			return ResponseEntity.ok(resultado);
					
			
		} else {
		
		return ResponseEntity.notFound().build();
	}
		
	}
	

}
