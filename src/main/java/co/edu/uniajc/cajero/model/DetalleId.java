package co.edu.uniajc.cajero.model;
// Generated 25-mar-2019 9:45:11 by Hibernate Tools 5.1.0.Alpha1

/**
 * DetalleId generated by hbm2java
 */
public class DetalleId implements java.io.Serializable {

	private int idDetalle;
	private int idTransaccion;

	public DetalleId() {
	}

	public DetalleId(int idDetalle, int idTransaccion) {
		this.idDetalle = idDetalle;
		this.idTransaccion = idTransaccion;
	}

	public int getIdDetalle() {
		return this.idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getIdTransaccion() {
		return this.idTransaccion;
	}

	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DetalleId))
			return false;
		DetalleId castOther = (DetalleId) other;

		return (this.getIdDetalle() == castOther.getIdDetalle())
				&& (this.getIdTransaccion() == castOther.getIdTransaccion());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdDetalle();
		result = 37 * result + this.getIdTransaccion();
		return result;
	}

}
