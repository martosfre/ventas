/**
 * 
 */
package com.matoosfe.ventas.model;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

/**
 * @author martosfre
 *
 */
@Embeddable
public class DetalleFactura {

	@Column
	@Required
	private int cantidad;
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal subtotal;
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal iva;
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal total;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Producto producto;

	public DetalleFactura() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
