package com.cqsrce.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PerfilUsuario {
	@Id
	private String perfUser;
	private String descripcion;
	private String estado;

}
