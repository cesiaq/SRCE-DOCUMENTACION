package com.cqsrce.models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

	public class Equiposervicio {
	
	@Id
	private Long eqId;
	private Long numOs;
	private Date fIngreso;
	private String tipEquipo;
	private String serie;
	private String codMarca;
	private String observaciones;
	private String estado;
}
