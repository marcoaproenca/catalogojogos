package com.marcocorp.catalogojogos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcocorp.catalogojogos.dao.JogoDAO;
import com.marcocorp.catalogojogos.model.Jogo;

@RestController
public class JogoController {
	
	@Autowired
	private JogoDAO dao;
	
	@GetMapping("/teste")
	public String teste() {
		return "Testando se tudo está funcionando";
	}
	
	@GetMapping("/jogos")
	public ArrayList<Jogo> recuperarTodos() {
		ArrayList<Jogo> lista;
		
		lista = (ArrayList<Jogo>)dao.findAll();
		return lista;
	}
}
