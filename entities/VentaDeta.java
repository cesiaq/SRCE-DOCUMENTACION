package com.cqsrce.models.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VentaDeta {
	@Id
	private Long ventdId;
	private Long ventId;
	private Long prodId;
	private Long numOs;
	private Long precioProd;
	private Long cantidad;
	private Long totalImporte;
}
