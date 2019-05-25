public class Nodo {

	private Nodo sig;
	private Fecha info;

	public Nodo() {

		this.sig = null;
	}

	public Nodo(Fecha info) {

		this.info = info;
		this.sig = null;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	public Fecha getInfo() {
		return info;
	}

	public void setInfo(Fecha info) {
		this.info = info;
	}

	public String toString() {

		String s = "Nodo ";
		s = s + this.info + " " + "---> ";

		return s;
	}

}