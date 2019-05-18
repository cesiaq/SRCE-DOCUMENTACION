package com.cqsrce.models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	private Long duiCli;
	private String nombre;
	private String apell1;
	private String apell2;
	private String tipDoc;
	private Date fAlta;
	private Date fBaja;
	private String email;
	private String tipCli;
	private String estado;
}
