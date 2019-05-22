package co.edu.uniajc.CajeroAutomatico.model;
// Generated 7/04/2019 12:54:01 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Estado generated by hbm2java
 */
public class Estado implements java.io.Serializable {

	private Integer idEstado;
	private String descripcion;
	private Set cuentas = new HashSet(0);
	private Set tarjetas = new HashSet(0);

	public Estado() {
	}

	public Estado(String descripcion, Set cuentas, Set tarjetas) {
		this.descripcion = descripcion;
		this.cuentas = cuentas;
		this.tarjetas = tarjetas;
	}

	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(Set cuentas) {
		this.cuentas = cuentas;
	}

	public Set getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(Set tarjetas) {
		this.tarjetas = tarjetas;
	}

}
