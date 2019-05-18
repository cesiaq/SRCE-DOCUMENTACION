package com.cqsrce.models.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venta2 {
	@Id
	private String ventId;
	private String duiCli;
	private Date fVenta;
	private String descripcion;
	private Long porceDesc;
	private Long iva;
	private Long subtotal;
	private String factura;
	private String tipoFactura;
}
