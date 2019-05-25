import java.util.Comparator;

public class Lista implements Comparable {

	private Nodo com;

	public Lista() {

		this.com = null;

	}

	public Nodo getCom() {

		return this.com;
	}

	public void setCom(Nodo com) {
		this.com = com;
	}

	public void addOrdenadamente(Fecha f, Comparator c) {

		Nodo nuevo = new Nodo(f);
		Nodo p;

		Nodo x = this.com;

		if (com == null) {
			com = nuevo;
		} else {

			if (c.compare(f, com.getInfo()) < 0) {
				nuevo.setSig(com);
				com = nuevo;
			} else {

				Nodo q = this.com;
				p = this.com;

				while (c.compare(f, p.getInfo()) >= 0 && p.getSig() != null) {
					q = p;
					p = p.getSig();

				}

				if (c.compare(f, p.getInfo()) >= 0) {

					p.setSig(nuevo);
				} else {
					nuevo.setSig(p);
					q.setSig(nuevo);
				}

			}

		}

	}

	public String toString() {

		String l = "Lista";
		Nodo p = this.com;

		while (p != null) {

			l = l + p;
			p = p.getSig();
		}

		return l;

	}

	public int compareTo(Object o) {

		Lista l = (Lista) o;
		Nodo p;
		Nodo q;
		p = this.com;

		while (p.getSig() != null) {

			p = p.getSig();
		}

		q = p;

		return 0;
	}

}
