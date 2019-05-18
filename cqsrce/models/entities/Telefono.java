package com.cqsrce.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefono {
	@Id
	private String telefono;
	private String duiCli;
	private String estado;

}
