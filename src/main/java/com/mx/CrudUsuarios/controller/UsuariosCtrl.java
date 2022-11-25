package com.mx.CrudUsuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudUsuarios.dominio.Usuarios;
import com.mx.CrudUsuarios.servicios.UsuariosServ;

@Controller
@RequestMapping("ctrl/Usuarios")

public class UsuariosCtrl {
	
	@Autowired
	UsuariosServ usuariosServ;

	// http://localhost:5000/ctrl/Usuarios/inicio
	@GetMapping("inicio")
	public String inicio(Model model) {
		var lista = usuariosServ.listar();
		model.addAttribute("listaV", lista);
		return "index";
	}

	@GetMapping("abrirGuardar")
	public String abrirGuardar(Usuarios usuarios) {
		return "guardar";
	}

	@PostMapping("guardar")
	public String guardar(Usuarios usuarios) {
		usuariosServ.guardar(usuarios);
		return "redirect:/ctrl/Usuarios/inicio";
	}

	@GetMapping("abrirEditar/{idUsuarios}")
	public String abrirEditar(Usuarios usuarios, Model model) {
		usuarios = usuariosServ.buscar(usuarios);
		model.addAttribute("usuarios", usuarios);
		return "editar";
	}

	@PostMapping("editar")
	public String editar(Usuarios usuarios) {
		usuariosServ.editar(usuarios);
		return "redirect:/ctrl/Usuarios/inicio";
	}

	@GetMapping("abrirEliminar/{idUsuarios}")
	public String abrirEliminar(Usuarios usuarios, Model model) {
		usuarios = usuariosServ.buscar(usuarios);
		model.addAttribute("usuarios", usuarios);
		return "eliminar";
	}

	@PostMapping("eliminar")
	public String eliminar(Usuarios usuarios) {
		usuariosServ.eliminar(usuarios);
		return "redirect:/ctrl/Usuarios/inicio";
	}

}
