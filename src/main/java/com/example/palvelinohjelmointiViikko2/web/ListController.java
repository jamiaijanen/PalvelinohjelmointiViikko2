package com.example.palvelinohjelmointiViikko2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.palvelinohjelmointiViikko2.domain.Students;

@Controller
public class ListController {
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public String lista(Model model) {
		List<Students> lista = new ArrayList<Students>();
		lista.add(new Students("Kate", "Cole"));
		lista.add(new Students("Dan", "Brown"));
		lista.add(new Students("Mike", "Mars"));

		model.addAttribute("students", lista);

		return "lista";
	}
}
