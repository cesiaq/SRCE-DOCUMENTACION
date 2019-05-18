package com.cqsrce.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedor {
	@Id
	private long provId;
	private String nombre;
	private String direccion;
	private Long telefono;
	private String pais;
	private String ciudad;
	private String depto;
	private String correo;
	private String razonSocial;
	private String nit;
	private String tipProv;
	private String estado;
	private String datosExtras;

}
