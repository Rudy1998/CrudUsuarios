package com.mx.CrudUsuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudUsuarios.dominio.Usuarios;
import com.mx.CrudUsuarios.servicios.UsuariosServ;

@RestController
@RequestMapping("api/Usuarios")
@CrossOrigin

public class UsuariosWs {

	@Autowired
	UsuariosServ usuariosServ;

	// http://localhost:5000/api/Usuarios/listar
	@GetMapping("listar")
	public List<Usuarios> listar() {
		return usuariosServ.listar();
	}

	// http://localhost:5000/api/Usuarios/buscar
	@PostMapping("buscar")
	public Usuarios buscar(@RequestBody Usuarios usuarios) {
		return usuariosServ.buscar(usuarios);
	}

	// http://localhost:5000/api/Usuarios/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		usuariosServ.guardar(usuarios);
	}

	// http://localhost:5000/api/Usuarios/editar
	@PostMapping("editar")
	public void editar(@RequestBody Usuarios usuarios) {
		usuariosServ.editar(usuarios);
	}

	// http://localhost:5000/api/Usuarios/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Usuarios usuarios) {
		usuariosServ.eliminar(usuarios);
	}

}
