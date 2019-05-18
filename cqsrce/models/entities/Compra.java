package com.cqsrce.models.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compra {
	
	@Id
	private Long cpId;
	private Long pedId;
	private Long provId;
	private Date fFac;
	private Long iva;
	private Long subtotal;
	private String usuario;
	private String estado;

}