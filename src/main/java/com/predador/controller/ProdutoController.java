package com.predador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.predador.entidade.Produto;
import com.predador.service.ProdutoServicos;


@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {
	@Autowired
	private ProdutoServicos produtoServicos;
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Spring boot";
	}
	
	@GetMapping(path = "/todos")
	public String mostrarTodos() {
		return produtoServicos.consultarTodos().toString();
	}
}
