
public class SolicitudPrestamo {

	private int numPrestamo;
	private Fecha fecSolicitud;

	public SolicitudPrestamo() {

	}

	public int getNumPrestamo() {
		return numPrestamo;
	}

	public Fecha getFecSolicitud() {
		return fecSolicitud;
	}

	public SolicitudPrestamo(int numPrestamo, Fecha fecSolicitud) {
		super();
		this.numPrestamo = numPrestamo;
		this.fecSolicitud = fecSolicitud;
	}

	public String toString() {
		return "SolicitudPrestamo [numPrestamo=" + numPrestamo + ", fecSolicitud=" + fecSolicitud + "]";
	}

}
