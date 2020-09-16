package br.com.heberton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.heberton.dados.StaticBD;

@Controller
public class MyController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/sobre")
	public String sobre() {
		return "sobre";
	}
	
	@RequestMapping("/lista")
	public String get(Model model) {
		model.addAttribute("pagamentos", StaticBD.getPagamentos());
		return "lista-pagamentos";
	}
	
}
