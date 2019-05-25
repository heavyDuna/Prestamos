import java.util.TreeSet;

public class PrestamoCliente extends SolicitudPrestamo implements Prestable {

	private Persona solicitante;
	private int valor;
	private Lista fechasPago;

	public PrestamoCliente(Persona solicitante, int valor, Lista fec, int numPrestamo, Fecha fecSolicitud) {

		super(numPrestamo, fecSolicitud);

		this.solicitante = solicitante;
		this.valor = valor;
		this.fechasPago = fec;
	}

	public Persona getSolicitante() {
		return solicitante;
	}

	public int getValor() {
		return valor;
	}

	public Lista getFechasPago() {
		return fechasPago;
	}

	public Fecha fechaCancelacion() {

		Nodo p;
		p = this.fechasPago.getCom();

		Fecha f = new Fecha();

		while (p.getSig() != null) {

			p = p.getSig();
		}

		f = p.getInfo();

		// System.out.println(f);

		return f;

	}

	public void pago() throws PrestamoFinalizado {

		Nodo p;
		p = this.fechasPago.getCom();

		if (p != null) {

			this.fechasPago.setCom(p.getSig());

			if (this.fechasPago.getCom() == null) {

				throw new PrestamoFinalizado();

			}

		}

	}

	public TreeSet solicitantes() {

		TreeSet t = new TreeSet();

		t.add(this.solicitante);
		return t;
	}

	public String toString() {
		return "PrestamoCliente [solicitante=" + solicitante + ", valor=" + valor + ", fechasPago=" + fechasPago + "]";
	}

}
