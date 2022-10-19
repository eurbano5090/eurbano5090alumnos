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

import com.edutecno.controlalumnos.alumnos.modelo.Alumno;
import com.edutecno.controlalumnos.alumnos.service.AlumnoService;
import com.edutecno.controlalumnos.alumnos.service.DireccionService;

@Controller
@RequestMapping("alumnos")
public class AlumnoController {
	//controlador -> servicio -> repository----> BD
	
	@Autowired
	private AlumnoService alumnoService;
	
	@Autowired
	private DireccionService direccionService;
	
	
	@GetMapping("/crear")
	public ModelAndView crear() {
		ModelAndView modelAndView = new ModelAndView("crear-alumnos");
		modelAndView.addObject("alumno", new Alumno());
		modelAndView.addObject("direcciones", direccionService.findAll());
		return modelAndView;
	}
	
	@PostMapping("/crear")
	public RedirectView crear(@ModelAttribute Alumno alumno) {
		alumnoService.save(alumno);
		return new RedirectView("/alumnos");
	}
	
	@GetMapping
	public ModelAndView alumnos(Model model) {
		ModelAndView modelAndView = new ModelAndView("alumnos");
		modelAndView.addObject("alumnos", alumnoService.findAll());
		return modelAndView;
	}
	
}
