package com.mx.CrudUsuarios.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudUsuarios.dao.UsuariosDao;
import com.mx.CrudUsuarios.dominio.Usuarios;

@Service

public class UsuariosServImp implements UsuariosServ {

	@Autowired
	UsuariosDao usuariosDao;

	@Override
	public void guardar(Usuarios usuarios) {
		usuariosDao.save(usuarios);
	}

	@Override
	public void editar(Usuarios usuarios) {
		usuariosDao.save(usuarios);
	}

	@Override
	public void eliminar(Usuarios usuarios) {
		usuariosDao.delete(usuarios);
	}

	@Override
	public Usuarios buscar(Usuarios usuarios) {
		return usuariosDao.findById(usuarios.getIdUsuarios()).orElse(null);
	}

	@Override
	public List<Usuarios> listar() {
		return (List<Usuarios>) usuariosDao.findAll();
	}

}
