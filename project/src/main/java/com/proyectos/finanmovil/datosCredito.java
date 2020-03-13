package com.proyectos.finanmovil;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class datosCredito implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("descripcion solicitud")
	private java.lang.String descripcionSolicitud;
	@org.kie.api.definition.type.Label("tiempo amrotizacion")
	private int tiempoAmrotizacion;
	@org.kie.api.definition.type.Label("total deudas")
	private int totalDeudas;
	@org.kie.api.definition.type.Label("valor credito")
	private int valorCredito;

	@org.kie.api.definition.type.Label(value = "gasto personas")
	private int gastoPersona;

	public datosCredito() {
	}

	public java.lang.String getDescripcionSolicitud() {
		return this.descripcionSolicitud;
	}

	public void setDescripcionSolicitud(java.lang.String descripcionSolicitud) {
		this.descripcionSolicitud = descripcionSolicitud;
	}

	public int getTiempoAmrotizacion() {
		return this.tiempoAmrotizacion;
	}

	public void setTiempoAmrotizacion(int tiempoAmrotizacion) {
		this.tiempoAmrotizacion = tiempoAmrotizacion;
	}

	public int getTotalDeudas() {
		return this.totalDeudas;
	}

	public void setTotalDeudas(int totalDeudas) {
		this.totalDeudas = totalDeudas;
	}

	public int getValorCredito() {
		return this.valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int getGastoPersona() {
		return this.gastoPersona;
	}

	public void setGastoPersona(int gastoPersona) {
		this.gastoPersona = gastoPersona;
	}

	public datosCredito(java.lang.String descripcionSolicitud,
			int tiempoAmrotizacion, int totalDeudas, int valorCredito,
			int gastoPersona) {
		this.descripcionSolicitud = descripcionSolicitud;
		this.tiempoAmrotizacion = tiempoAmrotizacion;
		this.totalDeudas = totalDeudas;
		this.valorCredito = valorCredito;
		this.gastoPersona = gastoPersona;
	}

}