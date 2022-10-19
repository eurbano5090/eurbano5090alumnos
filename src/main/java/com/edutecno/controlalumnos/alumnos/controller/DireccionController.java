package com.edutecno.controlalumnos.alumnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.edutecno.controlalumnos.alumnos.modelo.Direccion;
import com.edutecno.controlalumnos.alumnos.service.DireccionService;

@Controller
@RequestMapping("direcciones")
public class DireccionController {
	//controlador -> servicio -> repository----> BD
	
	@Autowired
	private DireccionService direccionService;
	
	
	@GetMapping("/crear")
	public ModelAndView crear() {
		ModelAndView modelAndView = new ModelAndView("crear-direccion");
		modelAndView.addObject("direccion", new Direccion());
		return modelAndView;
	}
	
	@PostMapping("/crear")
	public RedirectView crear(@ModelAttribute Direccion direccion) {
		direccionService.save(direccion);
		return new RedirectView("/direcciones");
	}
	
	@GetMapping
	public ModelAndView direcciones(Model model) {
		//TODO verificar si el Model es necesario
		ModelAndView modelAndView = new ModelAndView("direcciones");
		modelAndView.addObject("direcciones", direccionService.findAll());
		return modelAndView;
	}
	
}
