import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class PrestamoCooperativa extends SolicitudPrestamo implements Prestable {

	private String nombre;
	private TreeSet cooperativa;

	public PrestamoCooperativa(String nombre, Comparator x) {

		super();
		this.nombre = nombre;
		this.cooperativa = new TreeSet(x);

	}

	public void añadir(PrestamoCliente p) {

		this.cooperativa.add(p);

	}

	public Fecha fechaCancelacion() {

		PrestamoCliente p;
		Fecha f = new Fecha();
		Iterator it = this.cooperativa.iterator();

		while (it.hasNext()) {

			p = (PrestamoCliente) it.next();

			f = p.fechaCancelacion();

		}

		// System.out.println(f);
		return f;
	}

	public void pago() throws PrestamoFinalizado {

		PrestamoCliente p;
		Iterator it = this.cooperativa.iterator();

		while (it.hasNext()) {

			p = (PrestamoCliente) it.next();
			try {

				p.pago();

			} catch (PrestamoFinalizado pres) {

				System.out.println("todo vacio");
			}

		}
	}

	public TreeSet solicitantes() {

		TreeSet t = new TreeSet(new ComparadorCifNombre());
		TreeSet t2 = new TreeSet(new ComparadorPersona());

		PrestamoCliente p;
		Persona per;
		Iterator it = this.cooperativa.iterator();

		while (it.hasNext()) {

			p = (PrestamoCliente) it.next();
			t = p.solicitantes();

			Iterator i = t.iterator();

			while (i.hasNext()) {

				per = (Persona) i.next();
				t2.add(per);

			}

		}

		// System.out.println(t2);

		return t2;
	}

	public int volumenPrestado() {

		int suma = 0;
		PrestamoCliente p;
		Iterator it = this.cooperativa.iterator();

		while (it.hasNext()) {

			p = (PrestamoCliente) it.next();
			suma = suma + p.volumenPrestado();

		}
		
		//System.out.println(total);

		return suma;
	}

	public String toString() {
		return "PrestamoCooperativa [nombre=" + nombre + ", cooperativa=" + cooperativa.toString() + "]";
	}

}
