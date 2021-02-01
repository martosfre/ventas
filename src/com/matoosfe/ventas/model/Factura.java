/**
 * 
 */
package com.matoosfe.ventas.model;

import java.math.*;
import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

/**
 * @author martosfre
 *
 */
@Entity
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Hidden
	private int id;
	@Column
	@Required
	private String numero;
	@Column
	@Required
	@Stereotype("FECHA")
	private LocalDate fecha;
	@ManyToOne
	@DescriptionsList(descriptionProperties = "identificacion, nombre, apellido")
	private Cliente cliente;
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal subtotal;
	@Column
	@Required(message = "Valor de Iva requerido")
	@Stereotype("DINERO")
	private BigDecimal iva;
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal total;
	@ElementCollection
	@ListProperties("producto.codigo, producto.nombre, producto.precio, cantidad, subtotal, iva, total")
	private List<DetalleFactura> detalles;

	public Factura() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the subtotal
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the iva
	 */
	public BigDecimal getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	/**
	 * @return the detalles
	 */
	public List<DetalleFactura> getDetalles() {
		return detalles;
	}

	/**
	 * @param detalles the detalles to set
	 */
	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}

}
