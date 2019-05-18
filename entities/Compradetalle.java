package com.cqsrce.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compradetalle {
	
	@Id
	private Long cpdId;
	private Long cpId;
	private Long cantidad;
	private Long totalImporte;
	private Long prodId;
}
