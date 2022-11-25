package com.mx.CrudUsuarios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudUsuarios.dominio.Usuarios;

public interface UsuariosDao extends JpaRepository<Usuarios, Integer> {

}
